package com.hyz.evil.bean;
/**
*Create at 2018年1月2日 下午5:22:24
*
*@autuor EVIL
*
*@version 1.0
*
*ProjectName SSMConfig
*
*Description: 
*        
*/
public class Question {
	
	private String id;
	private String errorCode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", errorCode=" + errorCode + "]";
	}
	
	
	
}
