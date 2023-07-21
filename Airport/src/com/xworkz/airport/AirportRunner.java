package com.xworkz.airport;

import com.xworkz.airport.dto.AirportDto;
import com.xworkz.airport.service.AirportService;
import com.xworkz.airport.service.AirportServiceImpl;

public class AirportRunner {

	public static void main(String[] args) {

		AirportService service = new AirportServiceImpl();

		AirportDto dto = new AirportDto(1, "Kempegowda", "Bangalore", "five", "8022012001");
		AirportDto dto1 = new AirportDto(2, "HAL", "Bangalore", "three", "8722012001");
		AirportDto dto2 = new AirportDto(3, "Hindustan ", "Bangalore", "four", "9022012001");
		System.out.println("===================save==============================");
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);

		System.out.println("===================findByrating==============================");
		AirportDto air = service.findByRating("'three'");
		System.out.println(air);

		System.out.println("===================updatephoneNumberbyAirportName==============================");
		boolean status = service.updatephoneNumberbyAirportName("'Kempegowda'", "9738831132");
		System.out.println(status);

		System.out.println("===================updateLocationAndRatingbyAirportName==============================");
		boolean resu = service.updateLocationAndRatingbyAirportName("'Kempegowda'", "six", "yalanka");
		System.out.println(resu);

//		System.out.println("===================Deletebyrating==============================");
//		boolean status1 = service.Deletebyrating("three");
//		System.out.println(status1);

		System.out.println("===================readAll==============================");
		service.readAll();

	}

}
