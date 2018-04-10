package com.crazyhonest.common.client.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoodsSearchRsp implements Serializable {

	private static final long serialVersionUID = 8699809590038952002L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@JsonProperty(value = "limit")
	private Integer limit;

	@JsonProperty(value = "offset")
	private Integer offset;

	@JsonProperty(value = "count")
	private Integer count;

	@JsonProperty(value = "goods")
	private List<GoodsRetrieveRsp> goods;

	public GoodsSearchRsp() {
		super();
	}

	public GoodsSearchRsp(Integer limit, Integer offset, Integer count, List<GoodsRetrieveRsp> goods) {
		super();
		this.limit = limit;
		this.offset = offset;
		this.count = count;
		this.goods = goods;
	}

	public Integer getCount() {
		return count;
	}

	public List<GoodsRetrieveRsp> getGoods() {
		return goods;
	}

	public Integer getLimit() {
		return limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public void setGoods(List<GoodsRetrieveRsp> goods) {
		this.goods = goods;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}
}
