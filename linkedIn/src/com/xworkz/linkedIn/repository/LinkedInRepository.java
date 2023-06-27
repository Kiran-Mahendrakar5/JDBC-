package com.xworkz.linkedIn.repository;

import com.xworkz.linkedIn.dto.LinkedInDto;

public interface LinkedInRepository {
	
	public boolean validateAndSave(LinkedInDto dto);
	public boolean updateByEmail(String email,int id);
	public boolean readByEmail(String email,int id);
	public boolean readAll(int id);
	public boolean readByid(int id);
	public boolean readByEmail(String email);
	public boolean deleteById(int id);
	public boolean deleteByEmail(String email);
	
	
	

}
