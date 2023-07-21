package com.xworkz.airport.service;

import java.util.List;

import com.xworkz.airport.dto.AirportDto;

public interface AirportService {
	
	public boolean save(AirportDto dto);
	
	public AirportDto findByRating(String rating);
	
	public boolean updatephoneNumberbyAirportName(String AirportName,String phoneNumber);
	
	public boolean updateLocationAndRatingbyAirportName(String AirportName,String Rating,String Location );
	
	public boolean Deletebyrating(String rating);
	
	public List<AirportDto> readAll();

}
