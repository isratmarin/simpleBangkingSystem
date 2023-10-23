package com.example.adminlogin;

public class AdminChangePin {
	int id;
	 String  oldPassword, newPassword;

	public AdminChangePin() {
		super();
	}

	public AdminChangePin(String oldPassword, String newPassword, int id) {
		super();
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.id = id;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public int getId() {
		return id;
	}

	public void setEmail(int id) {
		this.id = id;
	}
	 
	 
}
