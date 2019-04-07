package com.projectone.models;

public class Users {

	private Integer ersUsersId;
	private String ersUsername;
	private String ersPassword;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private Integer userRoleId;
	
	public Users() {
	}
	

	public Users(String ersUsername, String ersPassword, String userFirstName, String userLastName, String userEmail,
			Integer userRoleId) {
		super();
		this.ersUsername = ersUsername;
		this.ersPassword = ersPassword;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userRoleId = userRoleId;
	}

	public Integer getErsUsersId() {
		return ersUsersId;
	}

	public void setErsUsersId(Integer ersUsersId) {
		this.ersUsersId = ersUsersId;
	}

	public String getErsUsername() {
		return ersUsername;
	}

	public void setErsUsername(String ersUsername) {
		this.ersUsername = ersUsername;
	}

	public String getErsPassword() {
		return ersPassword;
	}

	public void setErsPassword(String ersPassword) {
		this.ersPassword = ersPassword;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	@Override
	public String toString() {
		return "Users [ersUsersId=" + ersUsersId + ", ersUsername=" + ersUsername + ", ersPassword=" + ersPassword
				+ ", userFirstName=" + userFirstName + ", userLastName=" + userLastName + ", userEmail=" + userEmail
				+ ", userRoleId=" + userRoleId + "]";
	}

	public Users(Integer ersUsersId, String ersUsername, String ersPassword, String userFirstName, String userLastName,
			String userEmail, Integer userRoleId) {
		super();
		this.ersUsersId = ersUsersId;
		this.ersUsername = ersUsername;
		this.ersPassword = ersPassword;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userRoleId = userRoleId;
	}
}
