package com.example.transection;

import java.sql.Date;

public class Transection {
	int t_id,t_account;
	String t_type;
	double t_amount;
	Date t_date;
	String t_notes;
	
	public Transection() {
		super();
	}
	public Transection(int t_id, int t_account, String t_type, double t_amount, Date t_date, String t_notes) {
		super();
		this.t_id = t_id;
		this.t_account = t_account;
		this.t_type = t_type;
		this.t_amount = t_amount;
		this.t_date = t_date;
		this.t_notes = t_notes;
	}
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public int getT_account() {
		return t_account;
	}
	public void setT_account(int t_account) {
		this.t_account = t_account;
	}
	public String getT_type() {
		return t_type;
	}
	public void setT_type(String t_type) {
		this.t_type = t_type;
	}
	public double getT_amount() {
		return t_amount;
	}
	public void setT_amount(double t_amount) {
		this.t_amount = t_amount;
	}
	public Date getT_date() {
		return t_date;
	}
	public void setT_dob(Date t_date) {
		this.t_date = t_date;
	}
	public String getT_notes() {
		return t_notes;
	}
	public void setT_notes(String t_notes) {
		this.t_notes = t_notes;
	}

	
	
}
