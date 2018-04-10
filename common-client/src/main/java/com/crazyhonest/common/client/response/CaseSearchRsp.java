package com.crazyhonest.common.client.response;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CaseSearchRsp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4477050006470791689L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@JsonProperty(value = "limit")
	private Integer limit;

	@JsonProperty(value = "offset")
	private Integer offset;

	@JsonProperty(value = "count")
	private Integer count;

	@JsonProperty(value = "cases")
	private List<CaseRetrieveRsp> cases;

	public CaseSearchRsp() {
		super();
	}

	public CaseSearchRsp(Integer limit, Integer offset, Integer count, List<CaseRetrieveRsp> cases) {
		super();
		this.limit = limit;
		this.offset = offset;
		this.count = count;
		this.cases = cases;
	}

	public List<CaseRetrieveRsp> getCases() {
		return cases;
	}

	public Integer getCount() {
		return count;
	}

	public Integer getLimit() {
		return limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setCases(List<CaseRetrieveRsp> cases) {
		this.cases = cases;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

}
