package com.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
	
	Connection conn;
	
	private String url = "jdbc:mysql://localhost:3306/online-examination-platform?useSSL=false&serverTimezone=UTC";
	private String user = "root";
	private String password = "vivek";
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	public Connection dbConn() throws SQLException {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Successfully Connection");
		} catch (ClassNotFoundException e) {
			System.out.println("Unsuccessful Connection");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) throws SQLException {
		dbConnect connect = new dbConnect();
		connect.dbConn();
	}

}
