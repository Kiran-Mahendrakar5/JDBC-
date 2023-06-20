package com.xworkz.phonePay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class phonePayRunner {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		 try {
			Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonePay","root","Xworkzodc@123");
			
			//writing query
			String query = "insert into phonePay values(35,'kishan',2500,150,1500,10000,1234,1,2,3)";

			
			Statement statement = cnn.createStatement(); 
			
			boolean insert = statement.execute(query);
			System.out.println(insert);
			
//			int i = statement.executeUpdate(query);
//			System.out.println("effect row;"+i);
			
			cnn.close();
			
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
//String query1 = "insert into mall values(1,'GarudaMall','Magrath Rd',250000,'nike',600,16,10,6,50,25)";
//String query2 = "insert into mall values(1,'MyntraSorting','Hongasandra',200000,'crocs',500,15,6,12,50,50)";
//String query3 = "insert into mall values(1,'GarudaMall','Magrath Rd',250000,'ishop',600,16,10,6,50,25)";
//String query4 = "insert into mall values(1,'TotalMall','Madiwala Rd',200000,'puma',500,15,6,12,50,50)";
//String query5 = "insert into mall values(1,'RoyalMeenakshiMall','BannerghattaRd',250000,'nike',600,16,10,6,50,25)";
//String query6 = "insert into mall values(1,'VegaCityMall','BannerghattaRd',200000,'crocs',500,15,6,12,50,50)";
//String query7 = "insert into mall values(1,'OrionMall','DrRajkumarRd',250000,'ishop',600,16,10,6,50,25)";
//String query8 = "insert into mall values(1,'central','PrimecoTowers',200000,'puma',500,15,6,12,50,50)";
//String query9 = "insert into mall values(1,'GarudaMall','Magrath Rd',250000,'nike',600,16,10,6,50,25)";
//String query10 = "insert into mall values(1,'MyntraSorting','Hongasandra',200000,'crocs',500,15,6,12,50,50)";
//String query11 = "insert into mall values(1,'GarudaMall','Magrath Rd',250000,'ishop',600,16,10,6,50,25)";
//String query12 = "insert into mall values(1,'TotalMall','Madiwala Rd',200000,'puma',500,15,6,12,50,50)";
//String query13 = "insert into mall values(1,'RoyalMeenakshiMall','BannerghattaRd',250000,'nike',600,16,10,6,50,25)";
//String query14 = "insert into mall values(1,'VegaCityMall','BannerghattaRd',200000,'crocs',500,15,6,12,50,50)";
//String query15 = "insert into mall values(1,'OrionMall','DrRajkumarRd',250000,'ishop',600,16,10,6,50,25)";
//String query16 = "insert into mall values(1,'MyntraSorting','Hongasandra',200000,'crocs',500,15,6,12,50,50)";
//String query17 = "insert into mall values(1,'GarudaMall','Magrath Rd',250000,'ishop',600,16,10,6,50,25)";
//String query18 = "insert into mall values(1,'TotalMall','Madiwala Rd',200000,'puma',500,15,6,12,50,50)";
//String query19 = "insert into mall values(1,'RoyalMeenakshiMall','BannerghattaRd',250000,'nike',600,16,10,6,50,25)";
//String query20 = "insert into mall values(1,'VegaCityMall','BannerghattaRd',200000,'crocs',500,15,6,12,50,50)";
//String query21 = "insert into mall values(1,'OrionMall','DrRajkumarRd',250000,'ishop',600,16,10,6,50,25)";
