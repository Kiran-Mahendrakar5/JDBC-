package com.xworkz.railways;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readrailwaysRunner {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			String query = "select * from railways";
			
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railways", "root","Xworkzodc@123");
			
			Statement statements = cntn.createStatement();
			
			ResultSet result = statements.executeQuery(query);
			System.out.println(result);
			
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt(1) +" "+ result.getString(2) +" "+ result.getString(3) +" "+ result.getString(4) +" "+ result.getInt(5) +" "+ result.getInt(6) +" "+ result.getInt(7) +" "+ result.getInt(8) +" "+ result.getInt(9) +" "+ result.getInt(10)  );
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
