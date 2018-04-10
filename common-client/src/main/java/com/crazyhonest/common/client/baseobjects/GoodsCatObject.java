package com.crazyhonest.common.client.baseobjects;

import java.io.Serializable;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsCatObject implements Serializable {

	private static final long serialVersionUID = -5288431902196767094L;

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
	 * 分类名称
	 */
	@Field("cat_name")
	@JsonProperty("cat_name")
	private Integer catName;
	/**
	 * 状态
	 */
	@Field("status")
	@JsonProperty("status")
	private Integer status;
	/**
	 * 父级分类 0:第一层级
	 */
	@Field("parent_id")
	@JsonProperty("parent_id")
	private Integer parentId;

	public Integer getCatName() {
		return catName;
	}

	public Integer getId() {
		return id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public Integer getStatus() {
		return status;
	}

	public GoodsCatObject setCatName(Integer catName) {
		this.catName = catName;
		return this;
	}

	public GoodsCatObject setId(Integer id) {
		this.id = id;
		return this;
	}

	public GoodsCatObject setParentId(Integer parentId) {
		this.parentId = parentId;
		return this;
	}

	public GoodsCatObject setStatus(Integer status) {
		this.status = status;
		return this;
	}
}
