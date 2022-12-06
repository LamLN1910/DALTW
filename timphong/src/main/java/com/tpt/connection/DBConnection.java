package com.tpt.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private final String userID = "timphong";
	private final String passWord = "01274757673";
	private final String url = "jdbc:mysql://db4free.net:3306/timphong?autoReconnect=true&useSSL=false";

	public Connection getConnection() throws Exception
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.print("success");
			return DriverManager.getConnection(url, userID, passWord);
			
		}catch(SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
	}
}