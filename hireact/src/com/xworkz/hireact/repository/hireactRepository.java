package com.xworkz.hireact.repository;

import com.xworkz.hireact.dto.hireactDto;

public interface hireactRepository {
	
	public boolean save(hireactDto dto);
	public boolean update(String skills,int id); 
	public boolean deleteByname(String name);
	public boolean readByid(int id);

}
