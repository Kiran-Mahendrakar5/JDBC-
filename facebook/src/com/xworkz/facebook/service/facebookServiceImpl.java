package com.xworkz.facebook.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.facebook.dto.facebookDto;
import com.xworkz.facebook.repository.facebookRepository;
import com.xworkz.facebook.repository.facebookRepositoryImpl;

public class facebookServiceImpl implements facebookService {

	facebookRepository repo = new facebookRepositoryImpl();
	private Object dto;

	@Override
	public boolean validateandSave(facebookDto dto) {
		ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
		Validator validator = validation.getValidator();
		Set<ConstraintViolation<facebookDto>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			boolean save = repo.validateandSave(dto);
			System.out.println(save);
		} else {
			System.out.println("erron in saved");
			System.out.println(   );
		}

		return true;
	}
	


	public boolean updateByProfile1(int id, String Profile) {
		ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
		Validator validator = validation.getValidator();
		Set<ConstraintViolation<Object>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			repo.updateByFacebookProfile(id, Profile);
		} else {
			System.out.println("error in update");
			System.out.println(ConstraintViolation);
		}
		return true;

	}

	@Override
	public boolean readByProfile(String Profile) {
		ValidatorFactory validatorfactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorfactory.getValidator();
		Set<ConstraintViolation<Object>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			repo.readByFacebookProfile(Profile);
		} else {
			System.out.println("error in read");
			System.out.println(ConstraintViolation);
		}

		return true;
	}

	@Override
	public boolean deleteByFacebookProfile(String FacebookProfile) {
		ValidatorFactory validatorfactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorfactory.getValidator();
		Set<ConstraintViolation<Object>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			repo.deleteByFacebookProfile(FacebookProfile);
		} else {
			System.out.println("error in deleteby facebook");
			System.out.println(ConstraintViolation);
		}
		return true;
	}

	@Override
	public boolean readByIdandcloseFriend(int id, String closeFriend) {
		ValidatorFactory validatorfactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorfactory.getValidator();
		Set<ConstraintViolation<Object>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			repo.readByIdandcloseFriend(id, closeFriend);
		} else {
			System.out.println("error in readidand closefriend");
			System.out.println(ConstraintViolation);
		}
		return true;
	}

	@Override
	public boolean readAll() {
		ValidatorFactory validatorfactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorfactory.getValidator();
		Set<ConstraintViolation<Object>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			repo.readAll();
		} else {
			System.out.println("error in readAll");
			System.out.println(ConstraintViolation);
		}
		return true;
	}


	@Override
	public boolean updateByProfile(int id, String Profile) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean readByProfile(String Profile) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean deleteByProfile(String Profile) {
		// TODO Auto-generated method stub
		return false;
	}

}
