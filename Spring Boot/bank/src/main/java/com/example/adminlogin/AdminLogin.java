package com.example.adminlogin;

public class AdminLogin {
	
	int id;
	String adminUsername, password, email, dob, address, gender, phone, img;
	
	String rowCount;
	
	public AdminLogin() {
		super();
	}
	
	public AdminLogin(String rowCount) {
		super();
		this.rowCount = rowCount;
	}

	


	public String getRowCount() {
		return rowCount;
	}

	public void setRowCount(String rowCount) {
		this.rowCount = rowCount;
	}

	public AdminLogin(int id, String adminUsername, String password, String email, String dob, String address, String gender,
			String phone, String img) {
		super();
		this.id = id;
		this.adminUsername = adminUsername;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	

}
