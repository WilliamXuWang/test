package rbb.poc.dummy.entity;

import rbb.poc.dummy.entity.comm.AmtType;
import rbb.poc.dummy.entity.comm.responseInfo;

public class rtrvAcctSummryResponse {
	
	private responseInfo responseInfo;
	private String acctIndex;
	private String displyID;
	private String acctHldrFulName;
	private AmtType ldgrBal;
	private AmtType availBal;
	private AmtType creditLmt;
	private boolean hideBalInd = false;
	private String prodCatCde;
	private String mergeProdCatcde;
	private String entProdTypeCde;
	private String status;
	private boolean realTmBalInd = false;
	private String lstUpDateTime;
	private boolean isAmanahProd = false;
	private String acctNknmInd;
	private String acctCcyCle;
	private boolean hasAcctDetails = false;
	private boolean hasAcctHistory = false;
	private boolean isSecinDary = false;
	private String ccyDesc;
	
	public rtrvAcctSummryResponse() {
		super();
	}

	public rtrvAcctSummryResponse(rbb.poc.dummy.entity.comm.responseInfo responseInfo, String acctIndex,
			String displyID, String acctHldrFulName, AmtType ldgrBal, AmtType availBal, AmtType creditLmt,
			boolean hideBalInd, String prodCatCde, String mergeProdCatcde, String entProdTypeCde, String status,
			boolean realTmBalInd, String lstUpDateTime, boolean isAmanahProd, String acctNknmInd, String acctCcyCle,
			boolean hasAcctDetails, boolean hasAcctHistory, boolean isSecinDary, String ccyDesc) {
		super();
		this.responseInfo = responseInfo;
		this.acctIndex = acctIndex;
		this.displyID = displyID;
		this.acctHldrFulName = acctHldrFulName;
		this.ldgrBal = ldgrBal;
		this.availBal = availBal;
		this.creditLmt = creditLmt;
		this.hideBalInd = hideBalInd;
		this.prodCatCde = prodCatCde;
		this.mergeProdCatcde = mergeProdCatcde;
		this.entProdTypeCde = entProdTypeCde;
		this.status = status;
		this.realTmBalInd = realTmBalInd;
		this.lstUpDateTime = lstUpDateTime;
		this.isAmanahProd = isAmanahProd;
		this.acctNknmInd = acctNknmInd;
		this.acctCcyCle = acctCcyCle;
		this.hasAcctDetails = hasAcctDetails;
		this.hasAcctHistory = hasAcctHistory;
		this.isSecinDary = isSecinDary;
		this.ccyDesc = ccyDesc;
	}

	public String getAcctIndex() {
		return acctIndex;
	}

	public void setAcctIndex(String acctIndex) {
		this.acctIndex = acctIndex;
	}

	public String getDisplyID() {
		return displyID;
	}

	public void setDisplyID(String displyID) {
		this.displyID = displyID;
	}

	public String getAcctHldrFulName() {
		return acctHldrFulName;
	}

	public void setAcctHldrFulName(String acctHldrFulName) {
		this.acctHldrFulName = acctHldrFulName;
	}

	public AmtType getLdgrBal() {
		return ldgrBal;
	}

	public void setLdgrBal(AmtType ldgrBal) {
		this.ldgrBal = ldgrBal;
	}

	public AmtType getAvailBal() {
		return availBal;
	}

	public void setAvailBal(AmtType availBal) {
		this.availBal = availBal;
	}

	public AmtType getCreditLmt() {
		return creditLmt;
	}

	public void setCreditLmt(AmtType creditLmt) {
		this.creditLmt = creditLmt;
	}

	public boolean isHideBalInd() {
		return hideBalInd;
	}

	public void setHideBalInd(boolean hideBalInd) {
		this.hideBalInd = hideBalInd;
	}

	public String getProdCatCde() {
		return prodCatCde;
	}

	public void setProdCatCde(String prodCatCde) {
		this.prodCatCde = prodCatCde;
	}

	public String getMergeProdCatcde() {
		return mergeProdCatcde;
	}

	public void setMergeProdCatcde(String mergeProdCatcde) {
		this.mergeProdCatcde = mergeProdCatcde;
	}

	public String getEntProdTypeCde() {
		return entProdTypeCde;
	}

	public void setEntProdTypeCde(String entProdTypeCde) {
		this.entProdTypeCde = entProdTypeCde;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isRealTmBalInd() {
		return realTmBalInd;
	}

	public void setRealTmBalInd(boolean realTmBalInd) {
		this.realTmBalInd = realTmBalInd;
	}

	public String getLstUpDateTime() {
		return lstUpDateTime;
	}

	public void setLstUpDateTime(String lstUpDateTime) {
		this.lstUpDateTime = lstUpDateTime;
	}

	public boolean isAmanahProd() {
		return isAmanahProd;
	}

	public void setAmanahProd(boolean isAmanahProd) {
		this.isAmanahProd = isAmanahProd;
	}

	public String getAcctNknmInd() {
		return acctNknmInd;
	}

	public void setAcctNknmInd(String acctNknmInd) {
		this.acctNknmInd = acctNknmInd;
	}

	public String getAcctCcyCle() {
		return acctCcyCle;
	}

	public void setAcctCcyCle(String acctCcyCle) {
		this.acctCcyCle = acctCcyCle;
	}

	public boolean isHasAcctDetails() {
		return hasAcctDetails;
	}

	public void setHasAcctDetails(boolean hasAcctDetails) {
		this.hasAcctDetails = hasAcctDetails;
	}

	public boolean isHasAcctHistory() {
		return hasAcctHistory;
	}

	public void setHasAcctHistory(boolean hasAcctHistory) {
		this.hasAcctHistory = hasAcctHistory;
	}

	public boolean isSecinDary() {
		return isSecinDary;
	}

	public void setSecinDary(boolean isSecinDary) {
		this.isSecinDary = isSecinDary;
	}

	public String getCcyDesc() {
		return ccyDesc;
	}

	public void setCcyDesc(String ccyDesc) {
		this.ccyDesc = ccyDesc;
	}

	public responseInfo getResponseInfo() {
		return responseInfo;
	}

	public void setResponseInfo(responseInfo responseInfo) {
		this.responseInfo = responseInfo;
	}
	
	
};
