package com.oracle.sun.common.exception;

public class BaseException extends RuntimeException {
	private static final long serialVersionUID = -84159025816512619L;
	
	/** 错误描述*/
	private String errorMsg;

	public BaseException() {
		super();
	}
	public BaseException(String errorMsg){
		super(errorMsg);
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}