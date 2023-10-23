package com.example.login;

public class UserLogin {
	int accountNo;
	int pin;
	
	
	public UserLogin() {
		super();
	}
	public UserLogin(int accountNo, int pin) {
		super();
		this.accountNo = accountNo;
		this.pin = pin;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
}
