package com.luv2code.springdemo.rest;
/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月16日 下午2:22:06
* 類說明
*/
public class CustomerErrorResponse {
	
	private int stauts;
	private String messages;
	private long timeStamp;
	
	public CustomerErrorResponse() {
		
	}

	public CustomerErrorResponse(int stauts, String messages, long timeStamp) {
		super();
		this.stauts = stauts;
		this.messages = messages;
		this.timeStamp = timeStamp;
	}

	public int getStauts() {
		return stauts;
	}

	public void setStauts(int stauts) {
		this.stauts = stauts;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
