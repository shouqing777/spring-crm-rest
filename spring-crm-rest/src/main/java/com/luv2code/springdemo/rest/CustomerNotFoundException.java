package com.luv2code.springdemo.rest;
/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月16日 下午2:28:00
* 類說明
*/
public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException() {

	}

	public CustomerNotFoundException(String message) {
		super(message);

	}

	public CustomerNotFoundException(Throwable cause) {
		super(cause);

	}

	public CustomerNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public CustomerNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
