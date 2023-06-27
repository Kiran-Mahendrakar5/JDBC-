package com.xworkz.linkedIn.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.linkedIn.dto.LinkedInDto;
import com.xworkz.linkedIn.repository.LinkedInRepository;
import com.xworkz.linkedIn.repository.LinkedInRepositoryImpl;

public class LinkedInServiceImpl implements LinkedInService {

	LinkedInRepository repo = new LinkedInRepositoryImpl();

	@Override
	public boolean validateAndSave(LinkedInDto dto) {
		
		ValidatorFactory validate = Validation.buildDefaultValidatorFactory();
		Validator validator = validate.getValidator();
		Set<ConstraintViolation<LinkedInDto>> constraint = validator.validate(dto);
		if(constraint.isEmpty()) {
			boolean save = repo.validateAndSave(dto);
			System.out.println(save);

		}else {
			System.out.println("error");
			System.out.println(constraint);
		}
		

		return true;
	}

	@Override
	public boolean updateByEmail(String email, int id) {
		if (email != null) {
			if (id != 0) {
				repo.updateByEmail(email, id);
			}
		}
		return true;
	}

	@Override
	public boolean readByEmail(String email, int id) {
		if (email != null) {
			if (id != 0) {
				repo.readByEmail(email);
			}
		}
		return true;
	}

	@Override
	public boolean readAll(int id) {
		if (id != 0) {
			repo.readAll(id);
		}
		return true;
	}

	@Override
	public boolean readByid(int id) {
		if (id != 0) {
			repo.readAll(id);
		}
		return true;
	}

	@Override
	public boolean readByEmail(String email) {
		if (email != null) {
			repo.readByEmail(email);
		}
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		if (id != 0) {
			repo.deleteById(id);
		}
		return true;
	}

	@Override
	public boolean deleteByEmail(String email) {
		if (email != null) {
			repo.deleteByEmail(email);
		}
		return true;
	}

}
