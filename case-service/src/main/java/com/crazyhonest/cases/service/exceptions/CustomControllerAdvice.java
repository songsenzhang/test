package com.crazyhonest.cases.service.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crazyhonest.common.client.baseobjects.Error;

@ControllerAdvice
public class CustomControllerAdvice {

	private final static Logger logger = LoggerFactory.getLogger(CustomControllerAdvice.class);

	private String version = "1.0.0";

	/**
	 * 全局异常捕捉处理
	 * 
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Map<String, Object> errorHandler(Exception ex) {
		ex.printStackTrace();
		logger.error(ex.getMessage());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("version", version);
		map.put("error", new Error(400, ex.getMessage()));
		return map;
	}
}
