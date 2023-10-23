package com.example.adminlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;






public class AdminLoginDA {
	Connection con;
	PreparedStatement pst;

	public AdminLogin check(AdminLogin r1) {
		AdminLogin w = null;
//System.out.println(r1.address);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pst = con.prepareStatement("select * from admin_login where password=? and email=?");
			pst.setString(1, r1.password);
			pst.setString(2, r1.email);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				w = new AdminLogin();
				w.setId(rs.getInt(1));
				w.setPassword(rs.getString(3));
				w.setEmail(rs.getString(4));

				//System.out.println(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return w;
	}

	// insert data
	public void insert(AdminLogin s1) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pst = con.prepareStatement("INSERT INTO admin_login VALUES (?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, s1.id);
			pst.setString(2, s1.adminUsername);
			pst.setString(3, s1.password);
			pst.setString(4, s1.email);
			pst.setString(5, s1.dob);
			pst.setString(6, s1.address);
			pst.setString(7, s1.gender);
			pst.setString(8, s1.phone);
			pst.setString(9, s1.img);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public AdminLogin adminById(int id) {
		AdminLogin ss1 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pst = con.prepareStatement("select * from admin_login where id =" + id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				ss1 = new AdminLogin(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),
						rs.getString(8), rs.getString(9));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ss1;
	}
	
	//row Count
	public AdminLogin countAllCustomer() {
		AdminLogin d = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pst = con.prepareStatement("SELECT COUNT(*) FROM admin_login");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				d = new AdminLogin();
				d.setRowCount(rs.getString(1));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return d;
	}
	
	public String getNewId() {
		String acc = "100001";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pst = con.prepareStatement("SELECT id FROM admin_login ORDER BY id DESC LIMIT 1");
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				int a = rs.getInt(1);
				a++;
				acc = String.valueOf(a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return acc;
	}
	
	//Change password admin
	
			public boolean changePassword(AdminChangePin p) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456"));
					pst = con.prepareStatement("update admin_login set password=? where id = ? and password=?");
					pst.setString(1, p.newPassword);
					pst.setInt(2, p.id);
					pst.setString(3, p.oldPassword);
					int x = pst.executeUpdate();
					if(x == 1) {
						return true;
					}
				} catch (Exception e) {
					System.out.println(e);
				}
				return false;
			}

}
