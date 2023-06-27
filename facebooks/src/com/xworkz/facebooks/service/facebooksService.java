package com.xworkz.facebooks.service;

import java.sql.SQLException;

import com.xworkz.facebooks.dto.facebooksDto;

public interface facebooksService {
	
	public boolean validateandsave(facebooksDto dto)throws ClassNotFoundException, SQLException ;

	public boolean readAll() throws ClassNotFoundException, SQLException;
	public boolean readByemail(String email) throws ClassNotFoundException, SQLException;
	public boolean updateByEmail(String email,int id) throws ClassNotFoundException, SQLException;
	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException;
	public boolean update(String firstName,String lastname,String dateOfBirth,String email,Long phoneNumber,String gender,Long passward) throws ClassNotFoundException, SQLException; 
	public boolean delete(int id) throws ClassNotFoundException, SQLException;




}
