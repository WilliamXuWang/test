package rbb.poc.dummy.entity.comm;

import java.math.BigDecimal;

public class AmtType {
	
	private java.math.BigDecimal amt = BigDecimal.ZERO;
	private String ccy;
	
	public AmtType() {
		super();
	}

	public AmtType(BigDecimal amt, String ccy) {
		super();
		this.amt = amt;
		this.ccy = ccy;
	}

	public java.math.BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(java.math.BigDecimal amt) {
		this.amt = amt;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	
}
