package com.xworkz.paytm.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.paytm.dto.paytmDto;
import com.xworkz.paytm.repository.paytmRepository;
import com.xworkz.paytm.repository.paytmRepositoryImpl;

public class paytmServiceImpl implements paytmService {
	paytmRepository repo = new paytmRepositoryImpl();
	private Object dto;

	@Override
	public boolean validateAndSave(paytmDto dto) {
		ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
		Validator validator = validation.getValidator();
		Set<ConstraintViolation<paytmDto>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
		boolean save =	repo.validateAndSave(dto);
			System.out.println(save);
		} else {
			System.out.println("erron in saved");
			System.out.println(ConstraintViolation );
		}
		return false;
	}

	@Override
	public boolean updateByEmail(String email, int id) {
		ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
		Validator validator = validation.getValidator();
		Set<ConstraintViolation<Object>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			repo.updateByEmail(email, id);
		} else {
			System.out.println("error in update");
			System.out.println(ConstraintViolation);
		}
    	return true;
	}

	@Override
	public boolean readByEmail(String email, int id) {
		repo.readByEmail(email, id);
		return false;
	}

	@Override
	public boolean readAll() {
		return repo.readAll();
	}

	@Override
	public boolean readByEmail(String email) {
		repo.readByEmail(email);
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
		Validator validator = validation.getValidator();
		Set<ConstraintViolation<Object>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			repo.deleteById(id);
		} else {
			System.out.println("error in update");
			System.out.println(ConstraintViolation);
		}
		return false;
	}

	@Override
	public boolean deleteByEmail(String email) {
		ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
		Validator validator = validation.getValidator();
		Set<ConstraintViolation<Object>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			repo.deleteByEmail(email);
		} else {
			System.out.println("error in update");
			System.out.println(ConstraintViolation);
		}
		return false;
	}

}
