package com.xworkz.eventorganization.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.eventorganization.dto.EventorganizationDto;

public class EventorganizationRepositoryImpl implements EventorganizationRepository {

	@Override
	public boolean validateAndSave(EventorganizationDto dto) {
		System.out.println("saved successfully");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");

			String query = "insert into eventorganization_table values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement prepare = cntn.prepareStatement(query);
			System.out.println("insert into;" + prepare);

			prepare.setInt(1, dto.getId());
			prepare.setString(2, dto.getfounder());
			prepare.setString(3, dto.getCEO());
			prepare.setString(4, dto.getLocation());
			prepare.setString(5, dto.getGmail());
			prepare.setString(6, dto.getModeOfPayment());
			prepare.setInt(7, dto.getEmployee());
			prepare.setString(8, dto.getEvents());
			prepare.setInt(9, dto.getRating());
			prepare.setInt(10, dto.getParticipantsPerDayCost());
			prepare.setInt(11, dto.getParticipantsWeekCost());
			prepare.setInt(12, dto.getPhonenumber());
			prepare.setInt(13, dto.getEstablishment());
			prepare.setInt(14, dto.getOpenTime());
			prepare.setInt(15, dto.getCloseTime());
			System.out.println("insert into;" + prepare);

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			prepare.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return true;
	}

	@Override
	public boolean update(String events, int id) {
		System.out.println("updated successfully");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			
			String query = "update eventorganization_table set events=? where id=?";
			
			PreparedStatement prepare = cntn.prepareStatement(query);
			System.out.println("insert into;"+prepare);
			
			prepare.setString(1, events);
			prepare.setInt(2, id);
			System.out.println("insert into;"+prepare);
			
			int i = prepare.executeUpdate();
		    System.out.println("insert into;"+i);
		    
		    if(i>0) {
		    	System.out.println("record updated;"+i);
		    }else {
		    	System.out.println("record not updated;"+i);
		    }
		    cntn.close();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return true;
	}

	@Override
	public boolean update1(String founder, int id) {
		System.out.println("updated founder successfully");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			
			String query = "update eventorganization_table set founder=? where id=?";
			
			PreparedStatement prepare = cntn.prepareStatement(query);
			System.out.println("insert into;"+prepare);
			
			prepare.setString(1, founder);
			prepare.setInt(2, id);
			
			System.out.println("insert into;"+prepare);
			
			int i = prepare.executeUpdate();
		    System.out.println("insert into;"+i);
		    
		    if(i>0) {
		    	System.out.println("record updated;"+i);
		    }else {
		    	System.out.println("record not updated;"+i);
		    }
		    cntn.close();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return true;
		
		
	}

	@Override
	public boolean update2(String gmail) {
		System.out.println("updated name successfully");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			
			String query = "update eventorganization_table set gmail=?";
			
			PreparedStatement prepare = cntn.prepareStatement(query);
			System.out.println("insert into;"+prepare);
			
			prepare.setString(1, gmail);
		
			
			System.out.println("insert into;"+prepare);
			
			int i = prepare.executeUpdate();
		    System.out.println("insert into;"+i);
		    
		    if(i>0) {
		    	System.out.println("record updated;"+i);
		    }else {
		    	System.out.println("record not updated;"+i);
		    }
		    cntn.close();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return true;
		
		
	}

	@Override
	public boolean update3(String founder, String CEO, String location, String gmail, String ModeOfPayment, int id) {
		
		System.out.println("updated founder,CEO,location,gmail,ModeOfPayment successfully");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventorganization", "root",
					"Xworkzodc@123");
			
			String query = "update eventorganization_table set founder=?,CEO=?,location=?,gmail=?,ModeOfPayment=? where id=?";
			
			PreparedStatement prepare = cntn.prepareStatement(query);
			System.out.println("insert into;"+prepare);
			
			prepare.setString(1, founder);
			prepare.setString(2, CEO);
			prepare.setString(3, location);
			prepare.setString(4, gmail);
			prepare.setString(5, ModeOfPayment);
			prepare.setInt(6, id);
			System.out.println("insert into after refresh sql value;"+prepare);
			
			int i = prepare.executeUpdate();
		    System.out.println("insert into;"+i);
		    
		    if(i>0) {
		    	System.out.println("record updated;"+i);
		    }else {
		    	System.out.println("record not updated;"+i);
		    }
		    cntn.close();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return true;
		
	}

}
