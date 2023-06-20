package com.xworkz.railways;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class railwaysRunner {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connecter = DriverManager.getConnection("jdbc:mysql://localhost:3306/railways","root","Xworkzodc@123");
			
			//writing query
			String query = "insert into railways values(25,'siddaganga',2500,'ac',6,3202,1234,2400,'black',250,1,2)";
		
		Statement statement = connecter.createStatement(); 
		
		boolean insert = statement.execute(query);
		System.out.println(insert);
		
//		int i = statement.executeUpdate(query);
//		System.out.println("effect row;"+i);
		
		connecter.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
