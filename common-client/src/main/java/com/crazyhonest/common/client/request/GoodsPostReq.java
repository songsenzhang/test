package com.crazyhonest.common.client.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsPostReq implements Serializable {

	private static final long serialVersionUID = -9151672126716226494L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 名称
	 */
	@JsonProperty("goods_name")
	private String goodsName;
	/**
	 * 货号
	 */
	@JsonProperty("article_number")
	private String articleNumber;
	/**
	 * 分类ID
	 */
	@JsonProperty("cat_id")
	private Integer catId;
	/**
	 * 类型ID
	 */
	@JsonProperty("type_id")
	private Integer typeId;
	/**
	 * 详情ID
	 */
	@JsonProperty("detail_id")
	private String detailId;
	/**
	 * 售价
	 */
	@JsonProperty("price")
	private Double price;
	/**
	 * 成本价
	 */
	@JsonProperty("cost_price")
	private Double costPrice;
	/**
	 * 市场价
	 */
	@JsonProperty("market_price")
	private Double marketPrice;
	/**
	 * 计量单位
	 */
	@JsonProperty("units")
	private String units;
	/**
	 * 搜索关键字
	 */
	@JsonProperty("keyword")
	private String keyword;
	/**
	 * 排序
	 */
	@JsonProperty("sort")
	private Integer sort;

	public String getArticleNumber() {
		return articleNumber;
	}

	public Integer getCatId() {
		return catId;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public String getDetailId() {
		return detailId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public String getKeyword() {
		return keyword;
	}

	public Double getMarketPrice() {
		return marketPrice;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getSort() {
		return sort;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public String getUnits() {
		return units;
	}

	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoodsPostReq [goodsName=");
		builder.append(goodsName);
		builder.append(", articleNumber=");
		builder.append(articleNumber);
		builder.append(", catId=");
		builder.append(catId);
		builder.append(", typeId=");
		builder.append(typeId);
		builder.append(", detailId=");
		builder.append(detailId);
		builder.append(", price=");
		builder.append(price);
		builder.append(", costPrice=");
		builder.append(costPrice);
		builder.append(", marketPrice=");
		builder.append(marketPrice);
		builder.append(", units=");
		builder.append(units);
		builder.append(", keyword=");
		builder.append(keyword);
		builder.append(", sort=");
		builder.append(sort);
		builder.append("]");
		return builder.toString();
	}

}
