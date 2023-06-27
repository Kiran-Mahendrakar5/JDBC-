package com.xworkz.facebooks;

import java.sql.SQLException;

import com.xworkz.facebooks.dto.facebooksDto;
import com.xworkz.facebooks.service.facebooksService;
import com.xworkz.facebooks.service.facebooksServiceImpl;

public class facebooksRunner {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		facebooksDto dto = new facebooksDto();
		dto.setId(5);
		dto.setFirstName("kishor");
		dto.setLastname("mahendraker");
		dto.setDateOfBirth("12/2/2003");
		dto.setEmail("kishan@gmail.com");
		dto.setPhoneNumber(9753637667l);
		dto.setGender("male");
		dto.setPassward(552344556l);
		
		facebooksService service = new facebooksServiceImpl();
		
//		service.validateandsave(dto);
//		service.readAll();
//		service.readByemail("kiran@gmail.com");
//		service.updateByEmail("aishu@gamil.com", ;
//		service.deleteByEmail("kishan@gmail.com");
//		service.update("king", "fisher", "23/2/2002", "king@gmail.com", 9887654556l, "male", 21345467l);
		service.delete(4);
	}

}
