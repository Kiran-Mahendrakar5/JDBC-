package com.xworkz.facebook.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.facebook.dto.facebookDto;

public class facebookRepositoryImpl implements facebookRepository {

	@Override
	public boolean validateandSave(facebookDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root",
					"Xworkzodc@123");
			String quary = "insert into facebook_table value (?,?,?,?,?,?,?)";

			PreparedStatement prepare = cntn.prepareStatement(quary);
			prepare.setInt(1, dto.getId());
			prepare.setString(2, dto.getProfile());
			prepare.setString(3, dto.getCloseFriend());
			prepare.setInt(4, dto.getPost());
			prepare.setInt(5, dto.getMutualFriends());
			prepare.setInt(6, dto.getLogInPassward());
			prepare.setInt(7, dto.getSharedPost());

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			cntn.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return true;
	}

	@Override
	public boolean updateByFacebookProfile(int id, String FacebookProfile) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root",
					"Xworkzodc@123");
			String quary = "update facebook_table set FacebookProfile =?,where id=?";
			PreparedStatement prepare = cntn.prepareStatement(quary);
			prepare.setInt(1, id);
			prepare.setString(2, FacebookProfile);

			int i = prepare.executeUpdate();
			System.out.println("insert into;"+i);
			
			cntn.close();
			
			

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;
	}

	@Override
	public boolean readByFacebookProfile(String FacebookProfile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByFacebookProfile(String FacebookProfile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readByIdandcloseFriend(int id, String closeFriend) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readAll() {
		// TODO Auto-generated method stub
		return false;
	}

}
