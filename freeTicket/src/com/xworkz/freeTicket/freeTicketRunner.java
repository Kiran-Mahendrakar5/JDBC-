package com.xworkz.freeTicket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class freeTicketRunner {
	
	public static void main(String[] args) {
		System.out.println("freeTicket project");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("mtsql driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/accountnumber","root","Xworkzodc@123");
			System.out.println(connect);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
