package com.xworkz.paytm.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.paytm.dto.paytmDto;

public class paytmRepositoryImpl implements paytmRepository {

	@Override
	public boolean validateAndSave(paytmDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm", "root", "Xworkzodc@123");
			String quary = "insert into paytm_table value (?,?,?,?,?,?,?,?)";

			PreparedStatement prepare = cntn.prepareStatement(quary);
			prepare.setInt(1, dto.getId());
			prepare.setString(2, dto.getName());
			prepare.setString(3, dto.getGmail());
			prepare.setInt(4, dto.getLogInPassward());
			prepare.setInt(5, dto.getTransectionPin());
			prepare.setInt(6, dto.getDailyTracsection());
			prepare.setInt(7, dto.getWeeklytransection());
			prepare.setInt(8, dto.getBalance());

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			prepare.close();
			cntn.close();

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
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm", "root", "Xworkzodc@123");
			String quary = "update paytm_table set email=?,where id=?";

			PreparedStatement prepare = cntn.prepareStatement(quary);
			prepare.setString(1, email);
			prepare.setInt(2, id);

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			prepare.close();
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
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm", "root",
					"Xworkzodc@123");
			String quary ="select * from paytm_table where gmail=?";
			
			PreparedStatement prepare = cntn.prepareStatement(quary);
			prepare.setString(1, email);
			
			
			ResultSet result = 	prepare.executeQuery();
			System.out.println(result);
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt(1)
							+" "+result.getString(2)
							+" "+result.getString(3)
							+" "+result.getInt(4)
							+" "+result.getInt(5)
							+" "+result.getInt(6)
							+" "+result.getInt(7)
							+" "+result.getInt(8));
				}
				cntn.close();
				
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;
	}
			
	@Override
	public boolean readAll() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm", "root",
					"Xworkzodc@123");
			String quary ="select * from paytm_table";
			
			PreparedStatement prepare = cntn.prepareStatement(quary);
			
			ResultSet result = 	prepare.executeQuery();
			System.out.println(result);
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt(1)
							+" "+result.getString(2)
							+" "+result.getString(3)
							+" "+result.getInt(4)
							+" "+result.getInt(5)
							+" "+result.getInt(6)
							+" "+result.getInt(7)
							+" "+result.getInt(8));
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
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm", "root",
					"Xworkzodc@123");
			String quary ="select * from paytm_table email=? ";
			
			PreparedStatement prepare = cntn.prepareStatement(quary);
			prepare.setString(1, email);
			
			
			ResultSet result = 	prepare.executeQuery();
			System.out.println(result);
			if(result!=null) {
				while(result.next()) {
					System.out.println(result.getInt(1)
							+" "+result.getString(2)
							+" "+result.getString(3)
							+" "+result.getInt(4)
							+" "+result.getInt(5)
							+" "+result.getInt(6)
							+" "+result.getInt(7)
							+" "+result.getInt(8));
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
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm", "root", "Xworkzodc@123");
			String quary = "delete from paytm_table where id=? ";

			PreparedStatement prepare = cntn.prepareStatement(quary);
			prepare.setInt(1, id);

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			prepare.close();
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
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/paytm", "root", "Xworkzodc@123");
			String quary = "delete from paytm_table email=? ";

			PreparedStatement prepare = cntn.prepareStatement(quary);
			prepare.setString(1, email);

			int i = prepare.executeUpdate();
			System.out.println("insert into;" + i);

			prepare.close();
			cntn.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return false;
	}

}
