package rbb.poc.dummy.entity.comm;

public class ProdCatType {
	
	private String[] prodCatCdeLst;
	private String proCatFltrInd;
	
	public ProdCatType() {
		super();
	}
	public ProdCatType(String[] prodCatCdeLst, String proCatFltrInd) {
		super();
		this.prodCatCdeLst = prodCatCdeLst;
		this.proCatFltrInd = proCatFltrInd;
	}
	public String[] getProdCatCdeLst() {
		return prodCatCdeLst;
	}
	public void setProdCatCdeLst(String[] prodCatCdeLst) {
		this.prodCatCdeLst = prodCatCdeLst;
	}
	public String getProCatFltrInd() {
		return proCatFltrInd;
	}
	public void setProCatFltrInd(String proCatFltrInd) {
		this.proCatFltrInd = proCatFltrInd;
	}
	
}
