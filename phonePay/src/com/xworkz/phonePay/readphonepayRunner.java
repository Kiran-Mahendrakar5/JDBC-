package com.xworkz.phonePay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readphonepayRunner {


public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			String query = "select * from phonepay";
			
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonepay", "root","Xworkzodc@123");
			
			Statement statements = cntn.createStatement();
			
			ResultSet result = statements.executeQuery(query);
			System.out.println(result);
			
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt(1) +" "+ result.getString(2) +" "+ result.getInt(3) +" "+ result.getInt(4) +" "+ result.getInt(5) +" "+ result.getInt(6) +" "+ result.getInt(7));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
