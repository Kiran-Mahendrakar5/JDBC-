package com.xworkz.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class hospitalRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
		
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root",
					"Xworkzodc@123");

			String query = "insert into hospital values(20,'Fortis','matthikere',1500,6000,500,2000,'ent',9,6)";

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
