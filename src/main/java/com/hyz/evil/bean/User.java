package com.hyz.evil.bean;
/**
*Create at 2018年1月2日 下午12:58:43
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
public class User {
	
	private String userId;
	private String accountNo;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", accountNo=" + accountNo + "]";
	}
	
	
	
}
