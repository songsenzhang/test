package com.crazyhonest.cases.service.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crazyhonest.cases.service.repository.couchbase.UserRepository;
import com.crazyhonest.common.client.baseobjects.UserObject;
import com.crazyhonest.common.client.request.UserPostReq;
import com.crazyhonest.common.client.request.UserUpdateReq;
import com.crazyhonest.common.client.response.UserRetrieveRsp;
import com.crazyhonest.common.client.response.UserSearchRsp;
import com.crazyhonest.common.client.response.DeleteRsp;
import com.crazyhonest.common.client.utils.DateUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/users")
@Api(value = "/users", tags = "User Service")
public class UserController {

	private final static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserRepository caseRepository;

	@ApiOperation(value = "create")
	@ApiResponse(response = UserRetrieveRsp.class, code = 201, message = "create successfully")
	@RequestMapping(method = RequestMethod.POST)
	public UserRetrieveRsp createUser(@Valid @RequestBody UserPostReq req) {
		logger.info(req.toString());

		// 转换对象
		UserObject body = new UserObject().convert(req, DateUtils.getTime());

		caseRepository.save(body.setId(UUID.randomUUID().toString()));

		return body.convert(body);
	}

	@ApiOperation(value = "delete")
	@ApiResponse(response = DeleteRsp.class, code = 204, message = "delete successfully")
	@RequestMapping(path = "{user_id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public DeleteRsp deleteTask(@PathVariable("user_id") String id) {
		logger.info("user_id {}", id);

		caseRepository.delete(id);

		return new DeleteRsp(id);
	}

	@ApiOperation(value = "retrieve")
	@ApiResponse(response = UserRetrieveRsp.class, code = 200, message = "retrieve successfully")
	@RequestMapping(path = "{user_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserRetrieveRsp retrieve(@PathVariable("user_id") String id) {
		logger.info("user_id {}", id);
		// 获取数据
		UserObject body = caseRepository.find(id);
		if (body == null) {
			throw new IllegalArgumentException("not found on this entity : " + id);
		}

		return body.convert(body);
	}

	@ApiOperation(value = "search")
	@ApiResponse(response = UserSearchRsp.class, code = 200, message = "search successfully")
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserSearchRsp search(@RequestParam(value = "limit", defaultValue = "10") Integer limit,
			@RequestParam(value = "offset", defaultValue = "0") Integer offset,
			@RequestParam(value = "type", required = false) Integer type,
			@RequestParam(value = "status", required = false) Integer status) {
		logger.info("limit {} offset {} type {},status {}", limit, offset, type, status);
		// 查询数据
		List<UserRetrieveRsp> resultList = new ArrayList<UserRetrieveRsp>();
		caseRepository.getView(type, status, limit, offset).stream().forEach((l) -> {
			resultList.add(l.convert(l));
		});

		// 返回参数
		UserSearchRsp result = new UserSearchRsp(limit, offset, caseRepository.count(type, status), resultList);

		return result;
	}

	@ApiOperation(value = "update")
	@ApiResponse(response = UserRetrieveRsp.class, code = 200, message = "update successfully")
	@RequestMapping(path = "{user_id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserRetrieveRsp update(@PathVariable("user_id") String id, @RequestBody UserUpdateReq req) {
		logger.info("user_id {},req {}", id, req.toString());

		UserObject body = caseRepository.find(id);
		if (body == null) {
			throw new IllegalArgumentException("not found on this entity : " + id);
		}
		body = body.convert(body, req, DateUtils.getTime());

		caseRepository.update(body);

		return body.convert(body);
	}

}
