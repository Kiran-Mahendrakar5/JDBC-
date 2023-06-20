package com.xworkz.metro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class metroRunner {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/metro","root","Xworkzodc@123");
			
			
			//String query = "insert into metro values(20,'kengeri','electric',10000,300,15,450,17,24)";
			String query = "update metro set location = where 2 ='whitefield'";
//			String query = "delete from metro where idmetro = 6";
			
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
