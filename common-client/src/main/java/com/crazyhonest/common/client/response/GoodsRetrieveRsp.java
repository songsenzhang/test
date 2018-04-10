package com.crazyhonest.common.client.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsRetrieveRsp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1715783159371079125L;
	/**
	 * ID
	 */
	@JsonProperty("id")
	private String id;
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

	public String getArticleNumber() {
		return articleNumber;
	}

	public Integer getCatId() {
		return catId;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public String getDetailId() {
		return detailId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public String getId() {
		return id;
	}

	public String getKeyword() {
		return keyword;
	}

	public Integer getLikeCount() {
		return likeCount;
	}

	public Double getMarketPrice() {
		return marketPrice;
	}

	public Long getModifiedTime() {
		return modifiedTime;
	}

	public Integer getPageView() {
		return pageView;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getSalesCount() {
		return salesCount;
	}

	public Integer getSort() {
		return sort;
	}

	public Integer getStatus() {
		return status;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public String getUnits() {
		return units;
	}

	public GoodsRetrieveRsp setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
		return this;
	}

	public GoodsRetrieveRsp setCatId(Integer catId) {
		this.catId = catId;
		return this;
	}

	public GoodsRetrieveRsp setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
		return this;
	}

	public GoodsRetrieveRsp setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
		return this;
	}

	public GoodsRetrieveRsp setCreateTime(Long createTime) {
		this.createTime = createTime;
		return this;
	}

	public GoodsRetrieveRsp setDetailId(String detailId) {
		this.detailId = detailId;
		return this;
	}

	public GoodsRetrieveRsp setGoodsName(String goodsName) {
		this.goodsName = goodsName;
		return this;
	}

	public GoodsRetrieveRsp setId(String id) {
		this.id = id;
		return this;
	}

	public GoodsRetrieveRsp setKeyword(String keyword) {
		this.keyword = keyword;
		return this;
	}

	public GoodsRetrieveRsp setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
		return this;
	}

	public GoodsRetrieveRsp setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
		return this;
	}

	public GoodsRetrieveRsp setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
		return this;
	}

	public GoodsRetrieveRsp setPageView(Integer pageView) {
		this.pageView = pageView;
		return this;
	}

	public GoodsRetrieveRsp setPrice(Double price) {
		this.price = price;
		return this;
	}

	public GoodsRetrieveRsp setSalesCount(Integer salesCount) {
		this.salesCount = salesCount;
		return this;
	}

	public GoodsRetrieveRsp setSort(Integer sort) {
		this.sort = sort;
		return this;
	}

	public GoodsRetrieveRsp setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public GoodsRetrieveRsp setTypeId(Integer typeId) {
		this.typeId = typeId;
		return this;
	}

	public GoodsRetrieveRsp setUnits(String units) {
		this.units = units;
		return this;
	}

}
