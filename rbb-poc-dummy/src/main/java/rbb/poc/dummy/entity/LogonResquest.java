package rbb.poc.dummy.entity;

public class LogonResquest {
	
	private String userID;
	private String password;
	
	public LogonResquest() {
		super();
	}

	public LogonResquest(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
