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

import com.crazyhonest.cases.service.repository.couchbase.CaseRepository;
import com.crazyhonest.common.client.baseobjects.CaseObject;
import com.crazyhonest.common.client.request.CasePostReq;
import com.crazyhonest.common.client.request.CaseUpdateReq;
import com.crazyhonest.common.client.response.CaseRetrieveRsp;
import com.crazyhonest.common.client.response.CaseSearchRsp;
import com.crazyhonest.common.client.response.DeleteRsp;
import com.crazyhonest.common.client.utils.DateUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/cases")
@Api(value = "/cases", tags = "Case Service")
public class CaseController {

	private final static Logger logger = LoggerFactory.getLogger(CaseController.class);

	@Autowired
	CaseRepository caseRepository;

	@ApiOperation(value = "create")
	@ApiResponse(response = CaseRetrieveRsp.class, code = 201, message = "create successfully")
	@RequestMapping(method = RequestMethod.POST)
	public CaseRetrieveRsp createCase(@Valid @RequestBody CasePostReq req) {
		logger.info(req.toString());

		// 转换对象
		CaseObject body = new CaseObject().convert(req, DateUtils.getTime());

		caseRepository.save(body.setId(UUID.randomUUID().toString()));

		return body.convert(body);
	}

	@ApiOperation(value = "delete")
	@ApiResponse(response = DeleteRsp.class, code = 204, message = "delete successfully")
	@RequestMapping(path = "{case_id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public DeleteRsp deleteTask(@PathVariable("case_id") String id) {
		logger.info("case_id {}", id);

		caseRepository.delete(id);

		return new DeleteRsp(id);
	}

	@ApiOperation(value = "retrieve")
	@ApiResponse(response = CaseRetrieveRsp.class, code = 200, message = "retrieve successfully")
	@RequestMapping(path = "{case_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public CaseRetrieveRsp retrieve(@PathVariable("case_id") String id) {
		logger.info("case_id {}", id);
		// 获取数据
		CaseObject body = caseRepository.find(id);
		if (body == null) {
			throw new IllegalArgumentException("not found on this entity : " + id);
		}

		return body.convert(body);
	}

	@ApiOperation(value = "search")
	@ApiResponse(response = CaseSearchRsp.class, code = 200, message = "search successfully")
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public CaseSearchRsp search(@RequestParam(value = "limit", defaultValue = "10") Integer limit,
			@RequestParam(value = "offset", defaultValue = "0") Integer offset,
			@RequestParam(value = "type", required = false) Integer type,
			@RequestParam(value = "status", required = false) Integer status) {
		logger.info("limit {} offset {} type {},status {}", limit, offset, type, status);
		// 查询数据
		List<CaseRetrieveRsp> resultList = new ArrayList<CaseRetrieveRsp>();
		caseRepository.getView(type, status, limit, offset).stream().forEach((l) -> {
			resultList.add(l.convert(l));
		});

		// 返回参数
		CaseSearchRsp result = new CaseSearchRsp(limit, offset, caseRepository.count(type, status), resultList);

		return result;
	}

	@ApiOperation(value = "update")
	@ApiResponse(response = CaseRetrieveRsp.class, code = 200, message = "update successfully")
	@RequestMapping(path = "{case_id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public CaseRetrieveRsp update(@PathVariable("case_id") String id, @RequestBody CaseUpdateReq req) {
		logger.info("case_id {},req {}", id, req.toString());

		CaseObject body = caseRepository.find(id);
		if (body == null) {
			throw new IllegalArgumentException("not found on this entity : " + id);
		}
		body = body.convert(body, req, DateUtils.getTime());

		caseRepository.update(body);

		return body.convert(body);
	}

}
