package com.ssafy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private String driverName;
	private String url = "jdbc:mysql://localhost:3306/ssafydb?serverTimezone=UTC";
	private String user = "ssafy";
	private String pass = "ssafy";
	
	// singleton
	private static DBUtil instance = new DBUtil();
	
	public static DBUtil getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public void close(AutoCloseable ... closeable) throws Exception {
		for (AutoCloseable a: closeable) {
			if(closeable != null) {
				try {
					a.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
