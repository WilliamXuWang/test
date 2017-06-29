package rbb.poc.dummy.entity.comm;

public class responseInfo {
	
	private String code;
	private String type;
	public responseInfo() {
		super();
	}
	public responseInfo(String code, String type) {
		super();
		this.code = code;
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
