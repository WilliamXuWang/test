package rbb.poc.dummy.entity.comm;

public class EntityIdentifier {

	private String ctryCde;
	private String grpMmbr;
	
	public EntityIdentifier() {
		super();
	}
	public EntityIdentifier(String ctryCde, String grpMmbr) {
		super();
		this.ctryCde = ctryCde;
		this.grpMmbr = grpMmbr;
	}
	public String getCtryCde() {
		return ctryCde;
	}
	public void setCtryCde(String ctryCde) {
		this.ctryCde = ctryCde;
	}
	public String getGrpMmbr() {
		return grpMmbr;
	}
	public void setGrpMmbr(String grpMmbr) {
		this.grpMmbr = grpMmbr;
	}
	
}
