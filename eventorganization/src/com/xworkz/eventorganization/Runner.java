 package com.xworkz.eventorganization;

import com.xworkz.eventorganization.dto.EventorganizationDto;
import com.xworkz.eventorganization.service.EventorganizationService;
import com.xworkz.eventorganization.service.EventorganizationServiceImpl;

public class Runner {
	
	public static void main(String[] args) {
		
		EventorganizationDto dto = new EventorganizationDto();
		
		
		dto.setId(16);
		dto.setFounder("rajkumar");
		dto.setCEO("raj");
		dto.setLocation("peenya");
		dto.setGmail("naming@gmail.com");
		dto.setModeOfPayment("phonePay");
		dto.setEmployee(75);
		dto.setEvents("ceremany");
		dto.setRating(5);
		dto.setParticipantsPerDayCost(75000);
		dto.setParticipantsWeekCost(500000);
		dto.setPhonenumber(976768745);
		dto.setEstablishment(2003);
		dto.setOpenTime(10);
		dto.setCloseTime(10);
		
		
		
		EventorganizationService service = new EventorganizationServiceImpl();
		service.validateAndSave(dto);
		
		System.out.println("..........update one field by id.............");
		
		service.update("happy", 2);
		
		System.out.println("..........update founder.............");
		
		service.update1("sathishmahendrakar", 2);
		
		System.out.println("..........update gamil.............");
		
		service.update2("effectevent@gmail.com");
		
		System.out.println(".....update eventorganization_table set founder,CEO,location,gmail,ModeOfPayment.....");
		
		service.update3("sathishkiran","kirankishu", "hosadurga", "kiran@gmail.com", "AnyScanner", 3);
	}

}
