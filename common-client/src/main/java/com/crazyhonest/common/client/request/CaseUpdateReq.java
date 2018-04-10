package com.crazyhonest.common.client.request;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CaseUpdateReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7859546977396622014L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 案例标题
	 */
	@JsonProperty("title")
	private String title;
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
	 * 状态 0:正常 1:删除
	 */
	@JsonProperty("status")
	private Integer status;

	/**
	 * 排序
	 */
	@JsonProperty("sort")
	private Integer sort;

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

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CaseUpdateReq [title=");
		builder.append(title);
		builder.append(", type=");
		builder.append(type);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", status=");
		builder.append(status);
		builder.append(", sort=");
		builder.append(sort);
		builder.append("]");
		return builder.toString();
	}

}
