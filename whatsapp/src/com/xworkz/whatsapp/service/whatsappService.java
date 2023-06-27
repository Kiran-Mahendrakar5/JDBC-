package com.xworkz.whatsapp.service;

import com.xworkz.whatsapp.dto.whatsappDto;

public interface whatsappService {
	
	public boolean validateAndSave(whatsappDto dto);
	public boolean update(String statusName);

}
