package com.example;

public class UpdateTransfer {
int accountNo;
double iniBlance;
public UpdateTransfer(int accountNo, double iniBlance) {
	super();
	this.accountNo = accountNo;
	this.iniBlance = iniBlance;
}
public UpdateTransfer() {
	super();
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public double getIniBlance() {
	return iniBlance;
}
public void setIniBlance(double iniBlance) {
	this.iniBlance = iniBlance;
}

}
