package com.xworkz.facebooks.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.facebooks.dto.facebooksDto;

public class facebooksRepositoryImpl implements facebooksRepository {

	@Override
	public boolean validateandsave(facebooksDto dto) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebooks", "root", "Xworkzodc@123");
		String quary = "insert into facebooks_table value(?,?,?,?,?,?,?,?)";

		PreparedStatement prepare = cntn.prepareStatement(quary);
		prepare.setInt(1, dto.getId());
		prepare.setString(2, dto.getFirstName());
		prepare.setString(3, dto.getLastname());
		prepare.setString(4, dto.getDateOfBirth());
		prepare.setString(5, dto.getEmail());
		prepare.setLong(6, dto.getPhoneNumber());
		prepare.setString(7, dto.getGender());
		prepare.setLong(8, dto.getPassward());

		int i = prepare.executeUpdate();
		System.out.println("insert into;" + i);

		cntn.close();

		return false;
	}

	@Override
	public boolean readAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebooks", "root", "Xworkzodc@123");
		String quary = "select * from  facebooks_table ";

		PreparedStatement prepare = cntn.prepareStatement(quary);
		System.out.println(prepare);

		ResultSet result = prepare.executeQuery();
		System.out.println(result);
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getString(4) + " " + result.getString(5) + " " + result.getLong(6) + " "
						+ result.getString(7) + " " + result.getLong(8));
			}
		}
		return false;
	}

	@Override
	public boolean readByemail(String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebooks", "root", "Xworkzodc@123");
		String quary = "select * from  facebooks_table where email=? ";

		PreparedStatement prepare = cntn.prepareStatement(quary);
		System.out.println(prepare);
		prepare.setString(1, email);

		ResultSet result = prepare.executeQuery();
		System.out.println(result);
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getString(4) + " " + result.getString(5) + " " + result.getLong(6) + " "
						+ result.getString(7) + " " + result.getLong(8));
			}
		}
		return false;
	}

	@Override
	public boolean updateByEmail(String email, int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebooks", "root", "Xworkzodc@123");
		String quary = "update facebooks_table set email=? where id=?";
		PreparedStatement prepare = cntn.prepareStatement(quary);
		System.out.println(prepare);
		prepare.setString(1, email);
		prepare.setInt(2, id);

		int i = prepare.executeUpdate();
		System.out.println("insert into;" + i);

		cntn.close();

		return false;
	}

	@Override
	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebooks", "root", "Xworkzodc@123");
		String quary = "delete from facebooks_table where email =?";
		PreparedStatement prepare = cntn.prepareStatement(quary);
		System.out.println(prepare);
		prepare.setString(1, email);


		int i = prepare.executeUpdate();
		System.out.println("insert into;" + i);

		cntn.close();
		return false;
	}

	@Override
	public boolean update(String firstName, String lastname, String dateOfBirth, String email, Long phoneNumber,
			String gender, Long passward) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebooks", "root", "Xworkzodc@123");
		String quary ="update facebooks_table set firstName=?, lastname=?, dateOfBirth=?, email=?, phoneNumber=?, gender=?, passward=? ";
		PreparedStatement prepare = cntn.prepareStatement(quary);
		System.out.println(prepare);
		prepare.setString(1, firstName);
		prepare.setString(2, lastname);
		prepare.setString(3, dateOfBirth);
		prepare.setString(4, email);
		prepare.setLong(5, phoneNumber);
		prepare.setString(6, gender);
		prepare.setLong(7, passward);
		
		int i = prepare.executeUpdate();
		System.out.println("insert into;" + i);

		cntn.close();

		
		
		return false;
	}

	@Override
	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebooks", "root", "Xworkzodc@123");
		String quary = "delete from facebooks_table where id =?";
		PreparedStatement prepare = cntn.prepareStatement(quary);
		System.out.println(prepare);
		prepare.setInt(1, id);


		int i = prepare.executeUpdate();
		System.out.println("insert into;" + i);

		cntn.close();
		return false;
	}

}
