package com.xworkz.airport.service;

import java.util.List;

import com.xworkz.airport.dto.AirportDto;
import com.xworkz.airport.repository.AirportRepository;
import com.xworkz.airport.repository.AirportRepositoryImpl;

public class AirportServiceImpl implements AirportService {

	AirportRepository repo = new AirportRepositoryImpl();

	@Override
	public boolean save(AirportDto dto) {
		if (dto != null) {
			if (dto.getId() != 0) {
				if (dto.getLocation() != null) {
					if (dto.getPhoneNumber() != null) {
						if (dto.getAirportName() != null) {
							if (dto.getRating() != null) {
								repo.save(dto);
								return true;
							}
							System.out.println("rating is null");
							return false;
						}
						System.out.println("AirportName is null");
						return false;
					}
					System.out.println("PhoneNumber is null");
					return false;
				}
				System.out.println("getLocation is null");
				return false;
			}
			System.out.println("Id is zero");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public AirportDto findByRating(String rating) {
		if(rating!=null) {
			System.out.println("validated rating");
			return repo.findByRating(rating);
		}
		return null;
	}

	@Override
	public boolean updatephoneNumberbyAirportName(String AirportName, String phoneNumber) {
		if(AirportName!=null) {
			if(phoneNumber!=null) {
				System.out.println("validated update");
				repo.updatephoneNumberbyAirportName(AirportName, phoneNumber);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateLocationAndRatingbyAirportName(String AirportName, String Rating, String Location) {
		if(AirportName!=null) {
			if(Rating!=null) {
				if(Location!=null) {
					System.out.println("validate updatelrn");
					repo.updateLocationAndRatingbyAirportName(AirportName, Rating, Location);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean Deletebyrating(String rating) {
		if(rating!=null) {
			System.out.println("validated rating");
			repo.Deletebyrating(rating);
			return true;
		}
		return false;
	}

	@Override
	public List<AirportDto> readAll() {
		
		return repo.readAll();
	}

	

}
