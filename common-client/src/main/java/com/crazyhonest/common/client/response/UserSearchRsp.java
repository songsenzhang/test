package com.crazyhonest.common.client.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSearchRsp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1756244561361988700L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@JsonProperty(value = "limit")
	private Integer limit;

	@JsonProperty(value = "offset")
	private Integer offset;

	@JsonProperty(value = "count")
	private Integer count;

	@JsonProperty(value = "users")
	private List<UserRetrieveRsp> users;

	public UserSearchRsp() {
		super();
	}

	public UserSearchRsp(Integer limit, Integer offset, Integer count, List<UserRetrieveRsp> users) {
		super();
		this.limit = limit;
		this.offset = offset;
		this.count = count;
		this.users = users;
	}

	public Integer getCount() {
		return count;
	}

	public Integer getLimit() {
		return limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public List<UserRetrieveRsp> getUsers() {
		return users;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public void setUsers(List<UserRetrieveRsp> users) {
		this.users = users;
	}

}
