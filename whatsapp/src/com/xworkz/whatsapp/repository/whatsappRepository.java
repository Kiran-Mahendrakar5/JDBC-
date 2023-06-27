package com.xworkz.whatsapp.repository;

import com.xworkz.whatsapp.dto.whatsappDto;

public interface whatsappRepository {
	
	public boolean save(whatsappDto dto);
	public boolean update(String statusName);

}
