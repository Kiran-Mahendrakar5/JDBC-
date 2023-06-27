package com.xworkz.eventorganization.service;

import com.xworkz.eventorganization.dto.EventorganizationDto;
import com.xworkz.eventorganization.repository.EventorganizationRepository;
import com.xworkz.eventorganization.repository.EventorganizationRepositoryImpl;

public class EventorganizationServiceImpl implements EventorganizationService {

	EventorganizationRepository ropo = new EventorganizationRepositoryImpl();

	@Override
	public boolean validateAndSave(EventorganizationDto dto) {
		boolean saved = ropo.validateAndSave(dto);
		System.out.println(saved);
		return true;

	}

	@Override
	public boolean update(String events, int id) {
		if (events != null) {
			if (id != 0) {
				ropo.update(events, id);
			}
		}
		return false;
	}

	@Override
	public boolean update1(String founder, int id) {
		if (founder != null) {
			if (id != 0) {
				ropo.update1(founder, id);
			}

		}
		return false;
	}

	@Override
	public boolean update2(String gmail) {
		if (gmail != null) {
			ropo.update2(gmail);
		}
		return false;
	}

	@Override
	public boolean update3(String founder, String CEO, String location, String gmail, String ModeOfPayment, int id) {
		if (founder != null) {
			if (CEO != null) {
				if (location != null) {
					if (gmail != null) {
						if (ModeOfPayment != null) {
							if (id != 0) {
								ropo.update3(founder, CEO, location, gmail, ModeOfPayment, id);
							}
						}
					}
				}
			}
		}
		return false;
	}

}
