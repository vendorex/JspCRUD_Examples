package com.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	public static Connection getConnection(){
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println("connected");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("not connected");
		}
		
		return con;
	}
	
}
