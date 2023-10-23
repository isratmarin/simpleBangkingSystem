package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mail.EmailSenderService;

@Service
public class HolderDA {
	
	@Autowired
	EmailSenderService mail;	
	
	Connection con;
	PreparedStatement pstmt;
	
	
	//insert data
	public void insert(Holder s) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pstmt = con.prepareStatement("INSERT INTO bank_data VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, s.accountNo);
			pstmt.setInt(2, s.micrNo);
			pstmt.setInt(3, s.pin);
			pstmt.setString(4, s.email);
			pstmt.setString(5, s.accType);
			pstmt.setString(6, s.address);
			pstmt.setString(7, s.gender);
			pstmt.setDouble(8, s.iniBlance);
			pstmt.setString(9, s.name);
			pstmt.setString(10, s.dob);
			pstmt.setString(11, s.nationality);
			pstmt.setString(12, s.religion);
			pstmt.setString(13, s.mobile);
			pstmt.setString(14, s.secQuestion);
			pstmt.setString(15, s.secAns);
			pstmt.setString(16, s.img);
			pstmt.setString(17, "active");
			pstmt.executeUpdate();
			mail.sendEmail(s.email, "Account Created Successfully", "Dear "+s.name
					+"\n Your Account Created Successfully"
					+"\n Your Inital Balance is "+s.iniBlance +" BDT"
					+"\n Thanks For Choosing us");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	//show data
	
	public List<Holder> allHolder() {
		List<Holder> sList = new ArrayList<>();
		Holder s;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pstmt = con.prepareStatement("SELECT * FROM bank_data");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				s = new Holder(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), 
						rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10),rs.getString(11),
						rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15), rs.getString(16), rs.getString(17));
				sList.add(s);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return sList;
	}
	
	
	
	public String getNewAccountNo() {
		String acc = "100001";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pstmt = con.prepareStatement("SELECT accountno FROM bank_data ORDER BY accountno DESC LIMIT 1");
			ResultSet rs = pstmt.executeQuery();
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

	// get data by accountNo
	public Holder holderByAccountno(int accountNo) {
		Holder s = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pstmt = con.prepareStatement("select * from bank_data where accountNo =" + accountNo);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				s = new Holder(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), 
						rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10),rs.getString(11),
						rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15), rs.getString(16), rs.getString(17));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	

	//Update Data
	public void updateHolder(Holder p) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456"));
			pstmt = con.prepareStatement("update bank_data set pin=?, accounttype=?, address=?, gender=?, initialbalance=?, name=?,"
										+ " dob=?, nationality=?, religion=?, mobile=? where accountno = ?");
			pstmt.setInt(1, p.pin);
			pstmt.setString(2, p.accType);
			pstmt.setString(3, p.address);
			pstmt.setString(4, p.gender);
			pstmt.setDouble(5, p.iniBlance);
			pstmt.setString(6, p.name);
			pstmt.setString(7, p.dob);
			pstmt.setString(8, p.nationality);
			pstmt.setString(9, p.religion);
			pstmt.setString(10, p.mobile);
			pstmt.setInt(11, p.accountNo);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Change password holder
		public boolean changePassword(ChangePin p) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456"));
				pstmt = con.prepareStatement("update bank_data set pin=? where accountno = ? and pin=?");
				pstmt.setInt(1, p.newPin);
				pstmt.setInt(2, p.accountNo);
				pstmt.setInt(3, p.oldPin);
				int x = pstmt.executeUpdate();
				System.out.println(x);
				
				if(x == 1) {
					return true;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			return false;
		}
		
	//Update transfer
	public void updateTransfer(UpdateTransfer p1) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456"));
			pstmt = con.prepareStatement("update bank_data set initialbalance=? where accountno = ?");
			pstmt.setDouble(1, p1.iniBlance);
			pstmt.setInt(2, p1.accountNo);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	//Delete Data

	public void deleteHolder(Holder x) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456"));
			pstmt = con.prepareStatement("delete from bank_data where accountno = ?");
			pstmt.setInt(1, x.accountNo);
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	//Account  Holder Count
	public Holder countAllCustomer() {
		Holder d = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pstmt = con.prepareStatement("SELECT COUNT(*) FROM bank_data");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				d = new Holder();
				d.setRowCount(rs.getString(1));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return d;
	}
	

	//user/ account holder profile
	public Holder holderByAccountno1(int accountNo) {
		Holder ss1 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456");
			pstmt = con.prepareStatement("select * from bank_data where accountno =" + accountNo);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				ss1 = new Holder(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), 
						rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10),rs.getString(11),
						rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15), rs.getString(16), rs.getString(17));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ss1;
	}
	
	//Update Data status
		public void updateHolderStatus(Holder p) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = (DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_db", "root", "nh123456"));
				pstmt = con.prepareStatement("update bank_data set  status=? where accountno = ?");
				pstmt.setString(1, p.status);
				pstmt.setInt(2, p.accountNo);
				pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	
	
}
