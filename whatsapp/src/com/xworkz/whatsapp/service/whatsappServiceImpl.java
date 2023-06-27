package com.xworkz.whatsapp.service;

import com.xworkz.whatsapp.dto.whatsappDto;
import com.xworkz.whatsapp.repository.whatsappRepository;
import com.xworkz.whatsapp.repository.whatsappRepositoryImpl;

public class whatsappServiceImpl implements whatsappService{
	
	whatsappRepository repo = new whatsappRepositoryImpl();

	@Override
	public boolean validateAndSave(whatsappDto dto) {
		boolean save = repo.save(dto);
		System.out.println(save);
		return true;
	}

	@Override
	public boolean update(String statusName) {
		if(statusName!=null) {
			repo.update(statusName);
			
		}
		return false;
	}

}
