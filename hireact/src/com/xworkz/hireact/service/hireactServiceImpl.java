package com.xworkz.hireact.service;

import com.xworkz.hireact.dto.hireactDto;
import com.xworkz.hireact.repository.hireactRepository;
import com.xworkz.hireact.repository.hireactRepositoryImpl;

public class hireactServiceImpl  implements hireactService{
	
	hireactRepository repo = new hireactRepositoryImpl();

	@Override
	public boolean save(hireactDto dto) {
		boolean save = repo.save(dto);
		System.out.println(save);
		return false;
	}

	@Override
	public boolean update(String skills, int id) {
		if(skills!=null) {
			if(id!=0) {
				repo.update(skills, id);
			}
		}
		return false;
	}

	@Override
	public boolean deleteByname(String name) {
		if(name!=null) {
			repo.deleteByname(name);
		}
		return false;
	}

	@Override
	public boolean readByid(int id) {
		if(id!=0) {
			repo.readByid(id);
		}
		return false;
	}

}
