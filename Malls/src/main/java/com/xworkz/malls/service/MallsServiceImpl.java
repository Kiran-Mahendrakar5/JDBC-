package com.xworkz.malls.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.malls.dto.MallsDto;
import com.xworkz.malls.repository.MallsRepository;
import com.xworkz.malls.repository.MallsRepositoryImpl;

public class MallsServiceImpl implements MallsService {
	
	MallsRepository repo = new MallsRepositoryImpl();

	@Override
	public boolean save(MallsDto dto) {
		ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
		Validator validator = validation.getValidator();
		Set<ConstraintViolation<MallsDto>> ConstraintViolation  = validator.validate(dto);
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
	public List<MallsDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public MallsDto findById(int id) {
		return repo.findById(id);
	}

	@Override
	public MallsDto findByName(String Name) {
		return repo.findByName(Name);
	}

	@Override
	public boolean updateByNameAndId(int id, String Name) {
		return repo.updateByNameAndId(id, Name);
	}

	@Override
	public boolean DeleteById(int id) {
		return repo.DeleteById(id);
	}

}
