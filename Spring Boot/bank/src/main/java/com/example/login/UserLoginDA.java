package com.example.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class UserLoginDA {
	Connection con;
	PreparedStatement pst;
	

	public UserLogin check(UserLogin s1) {
		UserLogin u = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pst = con.prepareStatement("select * from bank_data where accountno=? and pin=? and status=?");
			pst.setInt(1, s1.accountNo);
			pst.setInt(2, s1.pin);
			pst.setString(3, "active");
			ResultSet rs = pst.executeQuery();
			
			if (rs.next()) {
				u = new UserLogin();
				u.setAccountNo(rs.getInt(1));
				u.setPin(rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return u;
	}
	
}
