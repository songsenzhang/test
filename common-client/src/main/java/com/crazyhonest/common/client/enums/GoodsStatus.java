package com.crazyhonest.common.client.enums;

import java.util.EnumSet;

public enum GoodsStatus {
	/**
	 * 默认
	 */
	DEFAULT(0),
	/**
	 * 删除
	 */
	DELETE(-1);

	Integer val;

	private GoodsStatus(Integer val) {
		this.val = val;
	}

	public Integer getVal() {
		return val;
	}

	public static GoodsStatus getVal(Integer val) {
		for (GoodsStatus e : EnumSet.allOf(GoodsStatus.class)) {
			if (e.getVal().equals(val)) {
				return e;
			}
		}
		throw new IllegalArgumentException("goods_status error (0:default -1:delete): " + val);
	}

	public void setVal(Integer val) {
		this.val = val;
	}
}
