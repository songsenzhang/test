package com.crazyhonest.common.client.baseobjects;

import java.io.Serializable;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 货品表 -- 存储货品的各种规格，如L号白色、S号白色等等
 * 
 * @author songsen
 *
 */
public class ProductObject implements Serializable {

	private static final long serialVersionUID = -6189923556590562137L;

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
	 * 名称
	 */
	@Field("product_name")
	@JsonProperty("product_name")
	private String productName;
	/**
	 * 货号
	 */
	@Field("article_number")
	@JsonProperty("article_number")
	private String articleNumber;
	/**
	 * 库存
	 */
	@Field("store")
	@JsonProperty("store")
	private Integer store;
	/**
	 * 价格
	 */
	@Field("price")
	@JsonProperty("price")
	private Double price;

	public String getArticleNumber() {
		return articleNumber;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public Integer getId() {
		return id;
	}

	public Double getPrice() {
		return price;
	}

	public String getProductName() {
		return productName;
	}

	public Integer getStore() {
		return store;
	}

	public ProductObject setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
		return this;
	}

	public ProductObject setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
		return this;
	}

	public ProductObject setId(Integer id) {
		this.id = id;
		return this;
	}

	public ProductObject setPrice(Double price) {
		this.price = price;
		return this;
	}

	public ProductObject setProductName(String productName) {
		this.productName = productName;
		return this;
	}

	public ProductObject setStore(Integer store) {
		this.store = store;
		return this;
	}
}
