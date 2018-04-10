package com.crazyhonest.common.client.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsUpdateReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4238004060243606733L;

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
	 * 状态: 0:上架 1:..
	 */
	@JsonProperty("status")
	private Integer status;
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
	 * 浏览次数
	 */
	@JsonProperty("page_view")
	private Integer pageView;
	/**
	 * 购买次数
	 */
	@JsonProperty("sales_count")
	private Integer salesCount;
	/**
	 * 收藏次数
	 */
	@JsonProperty("like_count")
	private Integer likeCount;
	/**
	 * 评价数
	 */
	@JsonProperty("comment_count")
	private Integer commentCount;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPageView() {
		return pageView;
	}

	public void setPageView(Integer pageView) {
		this.pageView = pageView;
	}

	public Integer getSalesCount() {
		return salesCount;
	}

	public void setSalesCount(Integer salesCount) {
		this.salesCount = salesCount;
	}

	public Integer getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

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
		builder.append("GoodsUpdateReq [goodsName=");
		builder.append(goodsName);
		builder.append(", articleNumber=");
		builder.append(articleNumber);
		builder.append(", catId=");
		builder.append(catId);
		builder.append(", typeId=");
		builder.append(typeId);
		builder.append(", detailId=");
		builder.append(detailId);
		builder.append(", status=");
		builder.append(status);
		builder.append(", price=");
		builder.append(price);
		builder.append(", costPrice=");
		builder.append(costPrice);
		builder.append(", marketPrice=");
		builder.append(marketPrice);
		builder.append(", units=");
		builder.append(units);
		builder.append(", pageView=");
		builder.append(pageView);
		builder.append(", salesCount=");
		builder.append(salesCount);
		builder.append(", likeCount=");
		builder.append(likeCount);
		builder.append(", commentCount=");
		builder.append(commentCount);
		builder.append(", keyword=");
		builder.append(keyword);
		builder.append(", sort=");
		builder.append(sort);
		builder.append("]");
		return builder.toString();
	}

}
