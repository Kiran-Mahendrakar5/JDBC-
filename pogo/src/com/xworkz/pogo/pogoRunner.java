package com.xworkz.pogo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class pogoRunner {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mysql driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			//connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chotabheema","root","Xworkzodc@123");
			System.out.println(connection.getSchema());
			
			//writing query
			String query = "insert into pogo values(7,'bheem','btm')";//key change becouse key shoud unique
			
			//create statement object
		Statement statement = connection.createStatement(); //create ,prepared ,callable
		
		//Executing statement to get the result
			//boolean insert = statement.execute(query);
			int i = statement.executeUpdate(query);
			System.out.println("effect row;"+i);
			
			//System.out.println(insert);
			
			//close connection
			connection.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
