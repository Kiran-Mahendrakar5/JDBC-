 package com.xworkz.hospitals.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.hospitals.dto.HospitalsDto;
import com.xworkz.hospitals.repository.HospitalsRepository;
import com.xworkz.hospitals.repository.HospitalsRepositoryImpl;

public class HospitalsServiceImpl implements HospitalsService {
	
	HospitalsRepository repo = new HospitalsRepositoryImpl();

	@Override
	public boolean save(HospitalsDto dto) {
		ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
		Validator validator = validation.getValidator();
		Set<ConstraintViolation<HospitalsDto>> ConstraintViolation  = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			boolean save = repo.save(dto);
			System.out.println(save);
			return true;
		} else {
			System.out.println("not saved");
		}
		return false;
	}

	@Override
	public List<HospitalsDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public HospitalsDto findById(int id) {
		
		return repo.findById(id);
	}

	@Override
	public HospitalsDto findByName(String HospitalName) {
		
		return repo.findByName(HospitalName);
	}

	@Override
	public boolean updateById(int id) {
		
		return repo.updateById(id);
	}

	@Override
	public boolean updateByNameAndId(int id, String HospitalName) {
		
		return repo.updateByNameAndId(id, HospitalName);
	}

	@Override
	public boolean DeleteById(int id) {
		
		return repo.DeleteById(id);
	}

}
