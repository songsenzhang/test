package com.crazyhonest.common.client.baseobjects;

import java.io.Serializable;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 货品库存 -- 定义多个库房的货品库存情况
 * 
 * @author songsen
 *
 */
public class ProductStoreObject implements Serializable {
	private static final long serialVersionUID = 1175278322189235370L;

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
	 * 商品ID
	 */
	@Field("goods_id")
	@JsonProperty("goods_id")
	private Integer goodsId;
	/**
	 * 货品ID
	 */
	@Field("product_id")
	@JsonProperty("product_id")
	private Integer productId;
	/**
	 * 仓库ID
	 */
	@Field("storage_room_id")
	@JsonProperty("storage_room_id")
	private String storageRoomId;
	/**
	 * 库存
	 */
	@Field("store")
	@JsonProperty("store")
	private Integer store;

	public Integer getGoodsId() {
		return goodsId;
	}

	public Integer getId() {
		return id;
	}

	public Integer getProductId() {
		return productId;
	}

	public String getStorageRoomId() {
		return storageRoomId;
	}

	public Integer getStore() {
		return store;
	}

	public ProductStoreObject setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
		return this;
	}

	public ProductStoreObject setId(Integer id) {
		this.id = id;
		return this;
	}

	public ProductStoreObject setProductId(Integer productId) {
		this.productId = productId;
		return this;
	}

	public ProductStoreObject setStorageRoomId(String storageRoomId) {
		this.storageRoomId = storageRoomId;
		return this;
	}

	public ProductStoreObject setStore(Integer store) {
		this.store = store;
		return this;
	}

}
