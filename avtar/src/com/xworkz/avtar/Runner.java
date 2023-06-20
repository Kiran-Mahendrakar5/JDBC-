package com.xworkz.avtar;

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
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/avtar","root","Xworkzodc@123");
			
		String query = "insert into avtar values(1,'Neteyam','Lightstorm','WaltDisney','JamesHorner','English','JamesCameron',237,2923)";
//			String query = "insert into avtar values(2,'wayofwater','Lightstorm','WaltDisney','	SimonFranglen','English','JamesCameron',460,2320)";
//			String query = "insert into avtar values(3,'avtharthree','Lightstorm','WaltDisney','	SimonFranglen','English','JamesCameron',460,2320)";
//			String query = "insert into avtar values(4,'avtharfour','Lightstorm','WaltDisney','	SimonFranglen','English','JamesCameron',460,2320)";
//			String query = "insert into avtar values(5,'avtharfive','Lightstorm','WaltDisney','	SimonFranglen','English','JamesCameron',460,2320)";
//			String query = "insert into avtar values(6,'avtharsix','Lightstorm','WaltDisney','	SimonFranglen','English','JamesCameron',460,2320)";
//			String query = "insert into avtar values(7,'avtharseven','Lightstorm','WaltDisney','	SimonFranglen','English','JamesCameron',460,2320)";
//			String query = "insert into avtar values(8,'avthareight','Lightstorm','WaltDisney','	SimonFranglen','English','JamesCameron',460,2320)";
//		String query = "insert into avtar values(9,'avtharnine','Lightstorm','WaltDisney','	SimonFranglen','English','JamesCameron',460,2320)";


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
