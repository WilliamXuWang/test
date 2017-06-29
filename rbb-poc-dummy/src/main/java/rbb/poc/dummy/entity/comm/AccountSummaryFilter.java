package rbb.poc.dummy.entity.comm;

public class AccountSummaryFilter {
	
	private String local;
	private EntityIdentifier[] entityCdes;
	private ProdCatType prodCatFltr;
	private boolean isLocalView = true;
	private int mostSupportCountriesNum = 5;
	private boolean enableAccountistOrder = true;
	private boolean enableGVAccountListOrder = true;
	private String custseg;
	
	public AccountSummaryFilter() {
		super();
	}
	
	public AccountSummaryFilter(String local, EntityIdentifier[] entityCdes, ProdCatType prodCatFltr,
			boolean isLocalView, int mostSupportCountriesNum, boolean enableAccountistOrder,
			boolean enableGVAccountListOrder, String custseg) {
		super();
		this.local = local;
		this.entityCdes = entityCdes;
		this.prodCatFltr = prodCatFltr;
		this.isLocalView = isLocalView;
		this.mostSupportCountriesNum = mostSupportCountriesNum;
		this.enableAccountistOrder = enableAccountistOrder;
		this.enableGVAccountListOrder = enableGVAccountListOrder;
		this.custseg = custseg;
	}

	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public EntityIdentifier[] getEntityCdes() {
		return entityCdes;
	}
	public void setEntityCdes(EntityIdentifier[] entityCdes) {
		this.entityCdes = entityCdes;
	}
	public ProdCatType getProdCatFltr() {
		return prodCatFltr;
	}
	public void setProdCatFltr(ProdCatType prodCatFltr) {
		this.prodCatFltr = prodCatFltr;
	}
	public boolean isLocalView() {
		return isLocalView;
	}
	public void setLocalView(boolean isLocalView) {
		this.isLocalView = isLocalView;
	}
	public int getMostSupportCountriesNum() {
		return mostSupportCountriesNum;
	}
	public void setMostSupportCountriesNum(int mostSupportCountriesNum) {
		this.mostSupportCountriesNum = mostSupportCountriesNum;
	}
	public boolean isEnableAccountistOrder() {
		return enableAccountistOrder;
	}
	public void setEnableAccountistOrder(boolean enableAccountistOrder) {
		this.enableAccountistOrder = enableAccountistOrder;
	}
	public boolean isEnableGVAccountListOrder() {
		return enableGVAccountListOrder;
	}
	public void setEnableGVAccountListOrder(boolean enableGVAccountListOrder) {
		this.enableGVAccountListOrder = enableGVAccountListOrder;
	}
	public String getCustseg() {
		return custseg;
	}
	public void setCustseg(String custseg) {
		this.custseg = custseg;
	}

}
