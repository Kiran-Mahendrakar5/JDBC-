package com.xworkz.hireact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {
	
	public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireact", "root",
					"Xworkzodc@123");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
