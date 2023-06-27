package com.xworkz.linkedIn.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.linkedIn.dto.LinkedInDto;

public class LinkedInRepositoryImpl implements LinkedInRepository {

	@Override
	public boolean validateAndSave(LinkedInDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String quary = "insert into linkedin_table value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);
			prepare.setInt(1, dto.getId());
			prepare.setString(2, dto.getProfile());
			prepare.setString(3, dto.getFirstName());
			prepare.setString(4, dto.getLastName());
			prepare.setString(5, dto.getQulaification());
			prepare.setString(6, dto.getSkills());
			prepare.setString(7, dto.getGmail());
			prepare.setString(8, dto.getMutualFreinds());
			prepare.setLong(9, dto.getPhoneNumber());
			prepare.setString(10, dto.getViewedPeople());
			prepare.setString(11, dto.getSavedPDF());
			prepare.setString(12, dto.getJobs());
			prepare.setInt(13, dto.getLogInPassward());
			prepare.setString(14, dto.getLocation());
			prepare.setString(15, dto.getSchool());
			prepare.setString(16, dto.getCollege());

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			prepare.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;
	}

	@Override
	public boolean updateByEmail(String email, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String quary = "update linkedin_table set email=? where id=?";
			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);
			prepare.setString(1, email);
			prepare.setInt(2, id);
			System.out.println("insert into;" + prepare);

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			cntn.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;
	}

	@Override
	public boolean readByEmail(String email, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String quary = "select * from  linkedin_table = email,where id=?";
			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);
			prepare.setString(1, email);
			prepare.setInt(2, id);
			System.out.println("insert into;" + prepare);
			ResultSet result = prepare.executeQuery();
			System.out.println(result);
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5) + " " + result.getString(6) + " "
							+ result.getString(7) + " " + result.getString(8) + " " + result.getLong(9) + " "
							+ result.getString(10) + " " + result.getString(11) + " " + result.getString(12) + " "
							+ result.getInt(13) + " " + result.getString(14) + " " + result.getString(15)
							+ " " + result.getString(16));
					
				}
				cntn.close();
				
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;
	}

	@Override
	public boolean readAll(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String quary = "select * from  linkedin_table ?";
			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);
			
			prepare.setInt(1, id);
			System.out.println("insert into;" + prepare);
			ResultSet result = prepare.executeQuery();
			System.out.println(result);
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5) + " " + result.getString(6) + " "
							+ result.getString(7) + " " + result.getString(8) + " " + result.getLong(9) + " "
							+ result.getString(10) + " " + result.getString(11) + " " + result.getString(12) + " "
							+ result.getInt(13) + " " + result.getString(14) + " " + result.getString(15)
							+ " " + result.getString(16));
					
				}
				cntn.close();
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		return false;
	}

	@Override
	public boolean readByid(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			String quary = "select * from  linkedin_table where id=?";
			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);
			
			prepare.setInt(1, id);
			System.out.println("insert into;" + prepare);
			ResultSet result = prepare.executeQuery();
			System.out.println(result);
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5) + " " + result.getString(6) + " "
							+ result.getString(7) + " " + result.getString(8) + " " + result.getLong(9) + " "
							+ result.getString(10) + " " + result.getString(11) + " " + result.getString(12) + " "
							+ result.getInt(13) + " " + result.getString(14) + " " + result.getString(15)
							+ " " + result.getString(16));
					
				}
				cntn.close();
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		
		}

		return false;
	}

	@Override
	public boolean readByEmail(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			String quary = "select * from  linkedin_table where id=?";
			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);
			
			prepare.setString(1, email);
		
			System.out.println("insert into;" + prepare);
			ResultSet result = prepare.executeQuery();
			System.out.println(result);
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5) + " " + result.getString(6) + " "
							+ result.getString(7) + " " + result.getString(8) + " " + result.getLong(9) + " "
							+ result.getString(10) + " " + result.getString(11) + " " + result.getString(12) + " "
							+ result.getInt(13) + " " + result.getString(14) + " " + result.getString(15)
							+ " " + result.getString(16));
					
				}
				cntn.close();
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		
		}

		return false;
		
		
	}

	@Override
	public boolean deleteById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			String quary ="delete from linkedin_table where id=?";
			
			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);
			
			prepare.setInt(1, id);
			
			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			cntn.close();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		return false;
	}

	@Override
	public boolean deleteByEmail(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");
			String quary ="delete from linkedin_table where email = ?";
			
			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);
			
			prepare.setString(1, email);
			
			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			cntn.close();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		return false;
		
	
	}

}
