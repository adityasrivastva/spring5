package com.aditya.hibernate.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";// Get rid of MySQL SSL warnings
		String user = "hbstudent";
		String pass = "hbstudentvfdvd";
		try {
			System.out.println("Connecting to database:"+ jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection Successfull !!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
