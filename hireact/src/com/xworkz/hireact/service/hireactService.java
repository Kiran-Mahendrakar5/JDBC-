package com.xworkz.hireact.service;

import com.xworkz.hireact.dto.hireactDto;

public interface hireactService {
	
	public boolean save(hireactDto dto);
	public boolean update(String skills,int id); 
	public boolean deleteByname(String name);
	public boolean readByid(int id);


}
