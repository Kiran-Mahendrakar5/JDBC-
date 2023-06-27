package com.xworkz.hireact.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.xworkz.hireact.dto.hireactDto;
import com.xworkz.hireact.service.hireactService;
import com.xworkz.hireact.service.hireactServiceImpl;

public class hireactRepositoryImpl implements hireactRepository {

	@Override
	public boolean save(hireactDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireact", "root",
					"Xworkzodc@123");

			String query = "insert into hireact_table values(?,?,?,?,?)";

			PreparedStatement prepare = cntn.prepareStatement(query);
			System.out.println("insert into;" + prepare);

			prepare.setInt(1, dto.getId());
			prepare.setString(2, dto.getName());
			prepare.setString(3, dto.getQualification());
			prepare.setString(4, dto.getSkills());
			prepare.setString(5, dto.getGmail());
			System.out.println("insert into;" + prepare);

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			prepare.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;

	}

	@Override
	public boolean update(String skills, int id) {
		System.out.println("update method");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireact", "root",
					"Xworkzodc@123");
			String query = "update hireact_table set skills=? where id=?";

			PreparedStatement prepare = cntn.prepareStatement(query);
			System.out.println("insert into;" + prepare);
			prepare.setString(1, skills);
			prepare.setInt(2, id);
			System.out.println("insert into;" + prepare);

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			if (i > 0) {
				System.out.println("record updated;" + i);
			} else {
				System.out.println("record not updated;" + i);
			}
			cntn.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return false;
	}

	@Override
	public boolean deleteByname(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireact", "root",
					"Xworkzodc@123");

			String quary = "delete from hireact_table where name =?";

			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);

			prepare.setString(1, name);
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
	public boolean readByid(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hireact", "root",
					"Xworkzodc@123");

			String quary = "Select * from  hireact_table where id=?";

			PreparedStatement prepare = cntn.prepareStatement(quary);
			System.out.println("insert into;" + prepare);
			prepare.setInt(1, id);
			System.out.println("insert into;" + prepare);

			ResultSet result = prepare.executeQuery();
			System.out.println(result);
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5));
					;
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;
	}
}
