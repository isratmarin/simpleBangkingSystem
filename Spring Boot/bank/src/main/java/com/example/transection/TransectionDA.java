package com.example.transection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class TransectionDA {

	Connection con;
	PreparedStatement pstmt;

	// insert data
	public void insert(Transection s) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pstmt = con.prepareStatement("INSERT INTO transection_table (account_no, type, amount, date, notes) VALUES (?,?,?,?,?)");
			
			pstmt.setInt(1, s.t_account);
			pstmt.setString(2, s.t_type);
			pstmt.setDouble(3, s.t_amount);
			pstmt.setDate(4, s.t_date);
			pstmt.setString(5, s.t_notes);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

		
	
	public List<Transection> transectionByAccountno() {
		List<Transection> sList1 = new ArrayList<>();
		Transection ss = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pstmt = con.prepareStatement("select * from transection_table");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				ss = new Transection(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDate(5), 
						rs.getString(6));
				sList1.add(ss);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList1;
	}
	
	public List<Transection> transection(String fromDate, String toDate) {
		List<Transection> sList1 = new ArrayList<>();
		Transection ss = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pstmt = con.prepareStatement("select * from transection_table where date between ? and ?");
			pstmt.setString(1, fromDate);
			pstmt.setString(2, toDate);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				ss = new Transection(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDate(5), 
						rs.getString(6));
				sList1.add(ss);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList1;
	}
}


