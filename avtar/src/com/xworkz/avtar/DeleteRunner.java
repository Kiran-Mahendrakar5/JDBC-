package com.xworkz.avtar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRunner {
	
public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avtar","root","Xworkzodc@123");
			
			String query = "delete from avtar where id = 2";


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
	