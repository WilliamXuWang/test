package rbb.poc.dummy.entity;

import rbb.poc.dummy.entity.comm.responseInfo;

public class LogonResponse {
	
	 private responseInfo responseInfo;

	public LogonResponse() {
		super();
	}

	public LogonResponse(rbb.poc.dummy.entity.comm.responseInfo responseInfo) {
		super();
		this.responseInfo = responseInfo;
	}

	public responseInfo getResponseInfo() {
		return responseInfo;
	}

	public void setResponseInfo(responseInfo responseInfo) {
		this.responseInfo = responseInfo;
	}
	 
}
