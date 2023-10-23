package com.example;

public class ChangePin {

	int accountNo, oldPin, newPin;

	public ChangePin() {
		super();
	}

	public ChangePin(int accountNo, int oldPin, int newPin) {
		super();
		this.accountNo = accountNo;
		this.oldPin = oldPin;
		this.newPin = newPin;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getOldPin() {
		return oldPin;
	}

	public void setOldPin(int oldPin) {
		this.oldPin = oldPin;
	}

	public int getNewPin() {
		return newPin;
	}

	public void setNewPin(int newPin) {
		this.newPin = newPin;
	}
	
	
	
}
