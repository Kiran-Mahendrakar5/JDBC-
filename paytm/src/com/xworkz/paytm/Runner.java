package com.xworkz.paytm;



import com.xworkz.paytm.dto.paytmDto;
import com.xworkz.paytm.service.paytmService;
import com.xworkz.paytm.service.paytmServiceImpl;

public class Runner {
	
	public static void main(String[] args) {
		
//		Date date = new Date(2003, 5, 15);
		
		paytmDto dto = new paytmDto();
		dto.setId(4);
		dto.setName("kiran");
		dto.setGmail("kiran@gmail.com");
		dto.setLogInPassward(12345);
		dto.setTransectionPin(5656);
		dto.setDailyTracsection(1000);
		dto.setWeeklytransection(4567);
		dto.setBalance(9500);
//		dto.setDate(date);
		
		paytmService service = new paytmServiceImpl();
		
//		service.validateAndSave(dto);
//		service.updateByEmail("kishan@gmail.com", 2);
		service.readByEmail("kiran@gmail.com", 2);
	}

}
