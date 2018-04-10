package com.crazyhonest.common.client.baseobjects;

import java.io.Serializable;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsTypeObject implements Serializable {
	private static final long serialVersionUID = 1693648774840817725L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 主键
	 */
	@Id
	@JsonProperty("id")
	private Integer id;
	/**
	 * 类型名称
	 */
	@Field("type_name")
	@JsonProperty("type_name")
	private Integer typeName;
	/**
	 * 状态
	 */
	@Field("status")
	@JsonProperty("status")
	private Integer status;

	public Integer getId() {
		return id;
	}

	public Integer getStatus() {
		return status;
	}

	public Integer getTypeName() {
		return typeName;
	}

	public GoodsTypeObject setId(Integer id) {
		this.id = id;
		return this;
	}

	public GoodsTypeObject setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public GoodsTypeObject setTypeName(Integer typeName) {
		this.typeName = typeName;
		return this;
	}
}
