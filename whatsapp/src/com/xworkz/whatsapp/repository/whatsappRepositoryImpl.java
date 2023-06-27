package com.xworkz.whatsapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.whatsapp.dto.whatsappDto;

public class whatsappRepositoryImpl implements whatsappRepository{

	@Override
	public boolean save(whatsappDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/whatsapp", "root",
					"Xworkzodc@123");
			
			String query = "insert into whatsapp_table values(?,?,?,?,?,?)";
		
			PreparedStatement prepare = cntn.prepareStatement(query);
			System.out.println("insert into;"+prepare);
			
			prepare.setInt(1, dto.getId());
			prepare.setString(2, dto.getName());
			prepare.setInt(3, dto.getPassword());
			prepare.setString(4, dto.getAchiveContact());
			prepare.setInt(5, dto.getNoOfContact());
			prepare.setString(6, dto.getStatusName());
			System.out.println("insert into;"+prepare);
			
			int i = prepare.executeUpdate();
		    System.out.println("insert into;"+i);
		    
		    prepare.close();
		    
		}catch(SQLException e) {
			e.printStackTrace();
		    
			
		
		}
		return true;
		
	}

	@Override
	public boolean update(String statusName) {//int id
		System.out.println("update method");
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection cntn = DriverManager.getConnection("jdbc:mysql://localhost:3306/whatsapp", "root",
					"Xworkzodc@123");
			
			String query = "update whatsapp_table set statusName=? where id=2";//id=?;
			
			PreparedStatement prepare = cntn.prepareStatement(query);
			System.out.println("insert into;"+prepare);
			prepare.setString(1, statusName);
//			prepare.setInt(2, id);
			System.out.println("insert into;"+prepare);
			
			int i = prepare.executeUpdate();
		    System.out.println("insert into;"+i);
		    
//		    cntn.commit();
		    cntn.close();
		
			
			
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		    
			
		
		
	}
		return false;
	}
	
}


