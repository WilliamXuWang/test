package rbb.poc.dummy.entity;

import rbb.poc.dummy.entity.comm.AccountSummaryFilter;

public class rtrvAcctSummryRequest {

	private AccountSummaryFilter accountSummaryFilter;
	private String type;
	
	public rtrvAcctSummryRequest() {
		super();
	}

	public rtrvAcctSummryRequest(AccountSummaryFilter accountSummaryFilter, String type) {
		super();
		this.accountSummaryFilter = accountSummaryFilter;
		this.type = type;
	}

	public AccountSummaryFilter getAccountSummaryFilter() {
		return accountSummaryFilter;
	}

	public void setAccountSummaryFilter(AccountSummaryFilter accountSummaryFilter) {
		this.accountSummaryFilter = accountSummaryFilter;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
