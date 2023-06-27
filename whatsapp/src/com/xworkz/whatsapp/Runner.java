package com.xworkz.whatsapp;

import com.xworkz.whatsapp.dto.whatsappDto;
import com.xworkz.whatsapp.service.whatsappService;
import com.xworkz.whatsapp.service.whatsappServiceImpl;

public class Runner {
	
	public static void main(String[] args) {
		
		whatsappDto dto = new whatsappDto();
		dto.setId(9);
		dto.setName("kiran");
		dto.setPassword(12345);
		dto.setAchiveContact("kishor");
		dto.setNoOfContact(120);
		dto.setStatusName("shokdhar");
		
		whatsappService service = new whatsappServiceImpl();
		service.validateAndSave(dto);
		
		service.update("baazar");
		
		
		
	}

}
