package com.crazyhonest.common.client.utils;

import java.io.UnsupportedEncodingException;

public class LocalStringUtils {
	public static String charsetName = "UTF-8";

	public static String byteToString(byte[] body) throws UnsupportedEncodingException {
		return new String(body, charsetName);
	}

	public static byte[] StringTobyte(String body) throws UnsupportedEncodingException {
		return body.getBytes(charsetName);
	}
}
