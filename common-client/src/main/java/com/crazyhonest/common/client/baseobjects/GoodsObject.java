package com.crazyhonest.common.client.baseobjects;

import java.io.Serializable;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.crazyhonest.common.client.request.GoodsPostReq;
import com.crazyhonest.common.client.request.GoodsUpdateReq;
import com.crazyhonest.common.client.response.GoodsRetrieveRsp;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4102505639164884625L;
	/**
	 * ID
	 */
	@Id
	@JsonProperty("id")
	private String id;
	/**
	 * 名称
	 */
	@Field("goods_name")
	@JsonProperty("goods_name")
	private String goodsName;
	/**
	 * 货号
	 */
	@Field("article_number")
	@JsonProperty("article_number")
	private String articleNumber;
	/**
	 * 分类ID
	 */
	@Field("cat_id")
	@JsonProperty("cat_id")
	private Integer catId;
	/**
	 * 类型ID
	 */
	@Field("type_id")
	@JsonProperty("type_id")
	private Integer typeId;
	/**
	 * 详情ID
	 */
	@Field("detail_id")
	@JsonProperty("detail_id")
	private String detailId;
	/**
	 * 状态: 0:上架 1:..
	 */
	@Field("status")
	@JsonProperty("status")
	private Integer status;
	/**
	 * 售价
	 */
	@Field("price")
	@JsonProperty("price")
	private Double price;
	/**
	 * 成本价
	 */
	@Field("cost_price")
	@JsonProperty("cost_price")
	private Double costPrice;
	/**
	 * 市场价
	 */
	@Field("market_price")
	@JsonProperty("market_price")
	private Double marketPrice;
	/**
	 * 计量单位
	 */
	@Field("units")
	@JsonProperty("units")
	private String units;
	/**
	 * 浏览次数
	 */
	@Field("page_view")
	@JsonProperty("page_view")
	private Integer pageView;
	/**
	 * 购买次数
	 */
	@Field("sales_count")
	@JsonProperty("sales_count")
	private Integer salesCount;
	/**
	 * 收藏次数
	 */
	@Field("like_count")
	@JsonProperty("like_count")
	private Integer likeCount;
	/**
	 * 评价数
	 */
	@Field("comment_count")
	@JsonProperty("comment_count")
	private Integer commentCount;
	/**
	 * 搜索关键字
	 */
	@Field("keyword")
	@JsonProperty("keyword")
	private String keyword;
	/**
	 * 排序
	 */
	@Field("sort")
	@JsonProperty("sort")
	private Integer sort;
	/**
	 * 创建时间
	 */
	@Field("create_time")
	@JsonProperty("create_time")
	private Long createTime;
	/**
	 * 修改时间
	 */
	@Field("modified_time")
	@JsonProperty("modified_time")
	private Long modifiedTime;

	public GoodsObject convert(final GoodsPostReq body, final Long time) {
		// TODO
		return new GoodsObject();
	}

	public GoodsRetrieveRsp convert(final GoodsObject body) {
		// TODO
		return new GoodsRetrieveRsp();
	}

	public GoodsObject convert(GoodsObject obj, final GoodsUpdateReq body, final Long time) {
		// TODO
		return obj;
	}

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

	public GoodsObject setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
		return this;
	}

	public GoodsObject setCatId(Integer catId) {
		this.catId = catId;
		return this;
	}

	public GoodsObject setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
		return this;
	}

	public GoodsObject setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
		return this;
	}

	public GoodsObject setCreateTime(Long createTime) {
		this.createTime = createTime;
		return this;
	}

	public GoodsObject setDetailId(String detailId) {
		this.detailId = detailId;
		return this;
	}

	public GoodsObject setGoodsName(String goodsName) {
		this.goodsName = goodsName;
		return this;
	}

	public GoodsObject setId(String id) {
		this.id = id;
		return this;
	}

	public GoodsObject setKeyword(String keyword) {
		this.keyword = keyword;
		return this;
	}

	public GoodsObject setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
		return this;
	}

	public GoodsObject setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
		return this;
	}

	public GoodsObject setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
		return this;
	}

	public GoodsObject setPageView(Integer pageView) {
		this.pageView = pageView;
		return this;
	}

	public GoodsObject setPrice(Double price) {
		this.price = price;
		return this;
	}

	public GoodsObject setSalesCount(Integer salesCount) {
		this.salesCount = salesCount;
		return this;
	}

	public GoodsObject setSort(Integer sort) {
		this.sort = sort;
		return this;
	}

	public GoodsObject setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public GoodsObject setTypeId(Integer typeId) {
		this.typeId = typeId;
		return this;
	}

	public GoodsObject setUnits(String units) {
		this.units = units;
		return this;
	}

}
