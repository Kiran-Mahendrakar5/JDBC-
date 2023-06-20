package com.xworkz.indeed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/indeed", "root",
					"Xworkzodc@123");
			String query = "insert into indeed values(1,'kiran','marthahalli','java','fresher','bsc','microsoft','english','kiran@gmail.com',48000)";
//		String query = "insert into indeed values(2,'kishan','sarjapura','python','fresher','bsc','microsoft','english','kiran@gmail.com',48000)";	
//			String query = "insert into indeed values(3,'aishu','whitefield','gns','fresher','bsc','mecedes','english','deepu@gmail.com',48000)";			
//			String query = "insert into indeed values(4,'deepu','peenya','webtechnology','fresher','be','microsoft','english','aishu@gmail.com',48000)";			
//		String query = "insert into indeed values(5,'karan','silkboard','c++','fresher','bsc','microsoft','english','karan@gmail.com',48000)";			
//			String query = "insert into indeed values(6,'kushal;','btm','java','fresher','bsc','microsoft','english','kushan@gmail.com',48000)";			
//		String query = "insert into indeed values(7,'bhema','marthahalli','java','fresher','bsc','microsoft','english','kiran@gmail.com',48000)";			
//		String query = "insert into indeed values(8,'raju','marthahalli','java','fresher','bsc','microsoft','english','kiran@gmail.com',48000)";			
//		String query = "insert into indeed values(9,'chutki','marthahalli','java','fresher','bsc','microsoft','english','kiran@gmail.com',48000)";			
//        	String query = "insert into indeed values(10,'dholu','marthahalli','java','fresher','bsc','microsoft','english','kiran@gmail.com',48000)";			

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
