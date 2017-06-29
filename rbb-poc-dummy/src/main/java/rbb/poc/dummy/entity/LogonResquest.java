package rbb.poc.dummy.entity;

public class LogonResquest {
	
	private String userID;
	private String passWorld;
	
	public LogonResquest() {
		super();
	}

	public LogonResquest(String userID, String passWorld) {
		super();
		this.userID = userID;
		this.passWorld = passWorld;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassWorld() {
		return passWorld;
	}

	public void setPassWorld(String passWorld) {
		this.passWorld = passWorld;
	}

}
