package com.example;

import org.springframework.stereotype.Service;

@Service
public class Holder {

	int accountNo;
	int micrNo;
	int pin;
	String email;
	String accType;
	String address;
	String gender;
	double iniBlance;
	String name;
	String dob;
	String nationality;
	String religion;
	String mobile;
	String secQuestion;
	String secAns;
	String img;
	String status;
	
	
	String rowCount;
	
	public Holder() {
		super();
	}

	
	public String getRowCount() {
		return rowCount;
	}


	public void setRowCount(String rowCount) {
		this.rowCount = rowCount;
	}


	public Holder(String rowCount) {
		super();
		this.rowCount = rowCount;
	}


	public Holder(int accountNo, int micrNo, int pin, String email, String accType, String address, String gender, double iniBlance,
			String name, String dob, String nationality, String religion, String mobile, String secQuestion,
			String secAns, String img, String status) {
		super();
		this.accountNo = accountNo;
		this.micrNo = micrNo;
		this.pin = pin;
		this.email=email;
		this.accType = accType;
		this.address = address;
		this.gender = gender;
		this.iniBlance = iniBlance;
		this.name = name;
		this.dob = dob;
		this.nationality = nationality;
		this.religion = religion;
		this.mobile = mobile;
		this.secQuestion = secQuestion;
		this.secAns = secAns;
		this.img=img;
		this.status=status;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getMicrNo() {
		return micrNo;
	}

	public void setMicrNo(int micrNo) {
		this.micrNo = micrNo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
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

	public double getIniBlance() {
		return iniBlance;
	}

	public void setIniBlance(double iniBlance) {
		this.iniBlance = iniBlance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSecQuestion() {
		return secQuestion;
	}

	public void setSecQuestion(String secQuestion) {
		this.secQuestion = secQuestion;
	}


	public String getSecAns() {
		return secAns;
	}

	public void setSecAns(String secAns) {
		this.secAns = secAns;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	 

}
