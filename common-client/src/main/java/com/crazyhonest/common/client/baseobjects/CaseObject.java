package com.crazyhonest.common.client.baseobjects;

import java.io.Serializable;

import org.springframework.util.StringUtils;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.crazyhonest.common.client.request.CasePostReq;
import com.crazyhonest.common.client.request.CaseUpdateReq;
import com.crazyhonest.common.client.response.CaseRetrieveRsp;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CaseObject implements Serializable {

	private static final long serialVersionUID = -3373321570433137540L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * ID
	 */
	@Id
	@JsonProperty("id")
	private String id;
	/**
	 * 案例标题
	 */
	@Field("title")
	@JsonProperty("title")
	private String title;
	/**
	 * 详情ID
	 */
	@Field("detail_id")
	@JsonProperty("detail_id")
	private String detailId;
	/**
	 * 分类
	 */
	@Field("type")
	@JsonProperty("type")
	private Integer type;
	/**
	 * 创建人
	 */
	@Field("user_id")
	@JsonProperty("user_id")
	private String userId;
	/**
	 * 创建时间
	 */
	@Field("create_time")
	@JsonProperty("create_time")
	private Long createTime;
	/**
	 * 修改时间
	 */
	@Field("modified_time")
	@JsonProperty("modified_time")
	private Long modifiedTime;
	/**
	 * 状态 0:正常 1:删除
	 */
	@Field("status")
	@JsonProperty("status")
	private Integer status;

	/**
	 * 排序
	 */
	@Field("sort")
	@JsonProperty("sort")
	private Integer sort;

	public CaseObject convert(final CasePostReq body, final Long time) {

		return new CaseObject().setTitle(body.getTitle()).setSort(body.getSort()).setStatus(body.getStatus())
				.setType(body.getType()).setUserId(body.getUserId()).setCreateTime(time);
	}

	public CaseObject convert(CaseObject obj, final CaseUpdateReq body, final Long time) {

		if (!StringUtils.isEmpty(body.getTitle())) {
			obj.setTitle(body.getTitle());
		}
		if (body.getSort() != null) {
			obj.setSort(body.getSort());
		}
		if (body.getStatus() != null) {
			obj.setStatus(body.getStatus());
		}
		if (body.getType() != null) {
			obj.setType(body.getType());
		}
		if (!StringUtils.isEmpty(body.getUserId())) {
			obj.setUserId(body.getUserId());
		}
		obj.setModifiedTime(time);
		return obj;
	}

	public CaseRetrieveRsp convert(final CaseObject body) {
		return new CaseRetrieveRsp().setCreateTime(body.getCreateTime()).setDetailId(body.getDetailId())
				.setId(body.getId()).setModifiedTime(body.getModifiedTime()).setSort(body.getSort())
				.setStatus(body.getStatus()).setTitle(body.getTitle()).setType(body.getType())
				.setUserId(body.getUserId());
	}

	public Long getCreateTime() {
		return createTime;
	}

	public String getDetailId() {
		return detailId;
	}

	public String getId() {
		return id;
	}

	public Long getModifiedTime() {
		return modifiedTime;
	}

	public Integer getSort() {
		return sort;
	}

	public Integer getStatus() {
		return status;
	}

	public String getTitle() {
		return title;
	}

	public Integer getType() {
		return type;
	}

	public String getUserId() {
		return userId;
	}

	public CaseObject setCreateTime(Long createTime) {
		this.createTime = createTime;
		return this;
	}

	public CaseObject setDetailId(String detailId) {
		this.detailId = detailId;
		return this;
	}

	public CaseObject setId(String id) {
		this.id = id;
		return this;
	}

	public CaseObject setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
		return this;
	}

	public CaseObject setSort(Integer sort) {
		this.sort = sort;
		return this;
	}

	public CaseObject setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public CaseObject setTitle(String title) {
		this.title = title;
		return this;
	}

	public CaseObject setType(Integer type) {
		this.type = type;
		return this;
	}

	public CaseObject setUserId(String userId) {
		this.userId = userId;
		return this;
	}
}
