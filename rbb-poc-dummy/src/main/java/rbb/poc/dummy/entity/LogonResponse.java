package rbb.poc.dummy.entity;

import java.math.BigDecimal;

import rbb.poc.dummy.entity.comm.responseInfo;

public class LogonResponse {
	
	 private responseInfo responseInfo;
	 private BigDecimal totalAmount = BigDecimal.ZERO;
	 private BigDecimal personalAmount = BigDecimal.ZERO;
	 private BigDecimal businessAmount = BigDecimal.ZERO;
	 private BigDecimal availableAmount = BigDecimal.ZERO;

	public LogonResponse() {
		super();
	}

	public LogonResponse(rbb.poc.dummy.entity.comm.responseInfo responseInfo, BigDecimal totalAmount,
			BigDecimal personalAmount, BigDecimal businessAmount, BigDecimal availableAmount) {
		super();
		this.responseInfo = responseInfo;
		this.totalAmount = totalAmount;
		this.personalAmount = personalAmount;
		this.businessAmount = businessAmount;
		this.availableAmount = availableAmount;
	}

	public responseInfo getResponseInfo() {
		return responseInfo;
	}

	public void setResponseInfo(responseInfo responseInfo) {
		this.responseInfo = responseInfo;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getPersonalAmount() {
		return personalAmount;
	}

	public void setPersonalAmount(BigDecimal personalAmount) {
		this.personalAmount = personalAmount;
	}

	public BigDecimal getBusinessAmount() {
		return businessAmount;
	}

	public void setBusinessAmount(BigDecimal businessAmount) {
		this.businessAmount = businessAmount;
	}

	public BigDecimal getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(BigDecimal availableAmount) {
		this.availableAmount = availableAmount;
	}
	
}
