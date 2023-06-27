package com.xworkz.linkedIn;

import com.xworkz.linkedIn.dto.LinkedInDto;
import com.xworkz.linkedIn.service.LinkedInService;
import com.xworkz.linkedIn.service.LinkedInServiceImpl;

public class Runner {
	
	public static void main(String[] args) {
		
		LinkedInDto dto = new LinkedInDto();
		dto.setId(7);
		dto.setProfile("kiran");
		dto.setFirstName("kiran");
		dto.setLastName("mahendrakar");
		dto.setQulaification("bsc");
		dto.setSkills("java");
		dto.setGmail("kishan@gmail.com");
		dto.setMutualFreinds("shuheb");
		dto.setPhoneNumber(97388311);
		dto.setViewedPeople("ashok");
		dto.setSavedPDF("sqlpdf");
		dto.setJobs("testing");
		dto.setLogInPassward(123456);
		dto.setLocation("btm");
		dto.setSchool("chetana");
		dto.setCollege("reva");
		
		LinkedInService service = new LinkedInServiceImpl();
		
     service.validateAndSave(dto);
		
//		service.updateByEmail("kiranone@gmail.com", 2);
		
//		boolean read = service.readByEmail("kiranone@gmail.com", 2);
//		System.out.println(read);
		
//		service.readAll(1); id wrong
		
//		service.readByid(3);
		
//	service.readByEmail("kishan@gmail.com");
//		service.deleteById(4);
		
//		service.deleteByEmail("kiran@gmail.com");
		
	}

}
