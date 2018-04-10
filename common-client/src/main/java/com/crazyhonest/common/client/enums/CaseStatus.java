package com.crazyhonest.common.client.enums;

import java.util.EnumSet;

public enum CaseStatus {
	/**
	 * 默认
	 */
	DEFAULT(0),
	/**
	 * 删除
	 */
	DELETE(-1);

	Integer val;

	private CaseStatus(Integer val) {
		this.val = val;
	}

	public Integer getVal() {
		return val;
	}

	public static CaseStatus getVal(Integer val) {
		for (CaseStatus e : EnumSet.allOf(CaseStatus.class)) {
			if (e.getVal().equals(val)) {
				return e;
			}
		}
		throw new IllegalArgumentException("case_status error (0:default -1:delete): " + val);
	}

	public void setVal(Integer val) {
		this.val = val;
	}
}
