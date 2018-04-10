package com.crazyhonest.common.client.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteRsp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7274022008029680764L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * ID
	 */
	@JsonProperty("id")
	private String id;

	public DeleteRsp() {
		super();
	}

	public DeleteRsp(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
