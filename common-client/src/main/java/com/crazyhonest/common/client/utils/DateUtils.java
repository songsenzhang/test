package com.crazyhonest.common.client.utils;

import java.util.Date;

public class DateUtils {

	public static Date getDate() {
		return new Date();
	}

	public static Long getTime() {
		return getDate().getTime();
	}
}
