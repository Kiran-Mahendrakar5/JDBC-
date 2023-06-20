package com.xworkz.mall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mallRunner {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mall","root","Xworkzodc@123");
			
			String query = "insert into mall values(20,'RoyalMeenakshiMall','BannerghattaRd',250000,'puma',45,50,1,4,55,2,5000)";
			
			Statement statement = cntn.createStatement(); 
			
			boolean insert = statement.execute(query);
			System.out.println(insert);
			
//			int i = statement.executeUpdate(query);
//			System.out.println("effect row;"+i);
			
			cntn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
