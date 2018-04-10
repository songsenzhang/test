package com.crazyhonest.common.client.response;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CaseRetrieveRsp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5202429035593936655L;
	/**
	 * ID
	 */
	@JsonProperty("id")
	private String id;
	/**
	 * 案例标题
	 */
	@JsonProperty("title")
	private String title;
	/**
	 * 详情ID
	 */
	@JsonProperty("detail_id")
	private String detailId;
	/**
	 * 分类
	 */
	@JsonProperty("type")
	private Integer type;
	/**
	 * 创建人
	 */
	@JsonProperty("user_id")
	private String userId;
	/**
	 * 创建时间
	 */
	@JsonProperty("create_time")
	private Long createTime;
	/**
	 * 修改时间
	 */
	@JsonProperty("modified_time")
	private Long modifiedTime;
	/**
	 * 状态 0:正常 1:删除
	 */
	@JsonProperty("status")
	private Integer status;

	/**
	 * 排序
	 */
	@JsonProperty("sort")
	private Integer sort;

	public void convert() {

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

	public CaseRetrieveRsp setCreateTime(Long createTime) {
		this.createTime = createTime;
		return this;
	}

	public CaseRetrieveRsp setDetailId(String detailId) {
		this.detailId = detailId;
		return this;
	}

	public CaseRetrieveRsp setId(String id) {
		this.id = id;
		return this;
	}

	public CaseRetrieveRsp setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
		return this;
	}

	public CaseRetrieveRsp setSort(Integer sort) {
		this.sort = sort;
		return this;
	}

	public CaseRetrieveRsp setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public CaseRetrieveRsp setTitle(String title) {
		this.title = title;
		return this;
	}

	public CaseRetrieveRsp setType(Integer type) {
		this.type = type;
		return this;
	}

	public CaseRetrieveRsp setUserId(String userId) {
		this.userId = userId;
		return this;
	}
}
