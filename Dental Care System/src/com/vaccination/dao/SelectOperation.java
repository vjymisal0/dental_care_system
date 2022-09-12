package com.vaccination.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SelectOperation{
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/dental";
	private static String user = "root";
	private static String pass = "";
	static Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	public ArrayList<String> select_appointment_details(String MobileNo) {
	ArrayList<String> al = new ArrayList<String>();
	try {
		System.out.print(MobileNo);
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, pass);
		st = con.createStatement();
		rs = st.executeQuery("SELECT  DATE, Treatments, TimeSlot FROM appoinmentdata WHERE Mobileno ="+MobileNo );
		while (rs.next()) {
			System.out.println(rs.getString("date"));
			al.add(rs.getString("DATE"));
			al.add(rs.getString("Treatments"));
			al.add(rs.getString("TimeSlot"));
			System.out.println(al);
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return al;
	}
	private static ArrayList<String> al = new ArrayList<String>();
	public ArrayList<String> select_profiles_details(String emailId) {
		
		try {
			System.out.print(emailId);
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			st = con.createStatement();
			rs = st.executeQuery("SELECT FName,MobileNo,EmailID,Gender,DOB FROM registrationrecord WHERE emailId ='"+emailId +"'");
			while (rs.next()) {
				al.add(rs.getString(1));
				al.add(rs.getString(2));
				al.add(rs.getString(3));
				al.add(rs.getString(4));
				al.add(rs.getString(5));
				//System.out.println(al);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return al;
		}

}
