package com.xworkz.indeed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadRunner {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
     		String query = "select * from indeed";// alldata
//			Read data based on id
//			String query ="select * from indeed where id = 1";
//			String query ="select * from indeed where id = 2";
//			String query ="select * from indeed where id = 3";
//			String query ="select * from indeed where id = 4";
//			String query ="select * from indeed where id = 5";
//			String query ="select * from indeed where id = 6";
//			String query ="select * from indeed where id = 7";
//			String query ="select * from indeed where id = 8";
//			String query ="select * from indeed where id = 9";
//			String query ="select * from indeed where id = 10";
			
//			Read data based on name
//			String query ="select * from indeed where name = 'kiran'";
//			String query ="select * from indeed where name = 'kishan'";
//			String query ="select * from indeed where name = 'aishu'";
//			String query ="select * from indeed where name = 'deepu'";
//			String query ="select * from indeed where name = 'karan'";
//			String query ="select * from indeed where name = 'kushal'";
//			String query ="select * from indeed where name = 'bhema'";
//			String query ="select * from indeed where name = 'raju'";
//			String query ="select * from indeed where name = 'chutki'";
//			String query ="select * from indeed where name = 'dholu'";
     		
     		//read data based on qualification
//     		String query ="select * from indeed where qualification = 'bsc'";
     		
			
			
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/indeed", "root","Xworkzodc@123");
			
			Statement statements = cntn.createStatement();
			
			ResultSet result = statements.executeQuery(query);
			System.out.println(result);
			
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt(1) +" "+ result.getString(2) +" "+ result.getString(3) +" "+ result.getString(4) +" "+ result.getString(5) +" "+ result.getString(6) +" "+ result.getString(7) +" "+ result.getString(8) +" "+ result.getString(9) +" "+ result.getInt(10)  );
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
