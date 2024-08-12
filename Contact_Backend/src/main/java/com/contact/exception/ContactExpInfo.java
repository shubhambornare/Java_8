package com.contact.exception;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

public class ContactExpInfo {
	
	private String errorCode;
	private String errorMsg;
	private LocalDateTime errorDate;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public LocalDateTime getErrorDate() {
		return errorDate;
	}
	public void setErrorDate(LocalDateTime errorDate) {
		this.errorDate = errorDate;
	}
	@Override
	public String toString() {
		return "ExpInfo [errorCode=" + errorCode + ", errorMsg=" + errorMsg + ", errorDate=" + errorDate + "]";
	}
	public ContactExpInfo(String errorCode, String errorMsg, LocalDateTime errorDate) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.errorDate = errorDate;
	}
	public ContactExpInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
