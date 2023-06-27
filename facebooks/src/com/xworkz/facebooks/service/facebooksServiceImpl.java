package com.xworkz.facebooks.service;

import java.sql.SQLException;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.facebooks.dto.facebooksDto;
import com.xworkz.facebooks.repository.facebooksRepository;
import com.xworkz.facebooks.repository.facebooksRepositoryImpl;

public class facebooksServiceImpl implements facebooksService {

	private facebooksRepository repo = new facebooksRepositoryImpl();
	private Object dto;

	@Override
	public boolean validateandsave(facebooksDto dto) throws ClassNotFoundException, SQLException {
		ValidatorFactory validation = Validation.buildDefaultValidatorFactory();
		Validator validator = validation.getValidator();
		Set<ConstraintViolation<facebooksDto>> ConstraintViolation = validator.validate(dto);
		if (ConstraintViolation.isEmpty()) {
			if (dto.getPhoneNumber() <= 10) {
				boolean save = repo.validateandsave(dto);
				System.out.println(save);
			}
			System.out.println("phone number >10");

		} else {
			System.out.println("error in save");
			System.out.println(ConstraintViolation);
		}
		return false;

	}

	public boolean readAll() throws ClassNotFoundException, SQLException {
		repo.readAll();
		return false;
	}

	@Override
	public boolean readByemail(String email) throws ClassNotFoundException, SQLException {
//		ValidatorFactory  validation= 	Validation.buildDefaultValidatorFactory();
//		Validator validator =	validation.getValidator();
//		Set<ConstraintViolation<Object>>  ConstraintViolation =	validator.validate(dto);
//		if(ConstraintViolation.isEmpty()) {
		boolean save = repo.readByemail(email);
//			System.out.println(save);
//		}else {
//			System.out.println("error in save");
//			System.out.println(ConstraintViolation);
//		}
		return false;

	}

	@Override
	public boolean updateByEmail(String email, int id) throws ClassNotFoundException, SQLException {
//		ValidatorFactory  validation= 	Validation.buildDefaultValidatorFactory();
//		Validator validator =	validation.getValidator();
//		Set<ConstraintViolation<Object>>  ConstraintViolation =	validator.validate(dto);
//		if(ConstraintViolation.isEmpty()) {
		boolean update = repo.updateByEmail(email, id);
		System.out.println(update);
//		}else {
//			System.out.println("error in save");
//			System.out.println(ConstraintViolation);
//		}
		return false;
	}

	@Override
	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException {
//		ValidatorFactory  validation= 	Validation.buildDefaultValidatorFactory();
//		Validator validator =	validation.getValidator();
//		Set<ConstraintViolation<Object>>  ConstraintViolation =	validator.validate(dto);
//		if(ConstraintViolation.isEmpty()) {
		boolean delete = repo.deleteByEmail(email);
		System.out.println(delete);
//		}else {
//			System.out.println("error in save");
//			System.out.println(ConstraintViolation);
//		}
		return false;

	}

	@Override
	public boolean update(String firstName, String lastname, String dateOfBirth, String email, Long phoneNumber,
			String gender, Long passward) throws ClassNotFoundException, SQLException {
//		ValidatorFactory  validation= 	Validation.buildDefaultValidatorFactory();
//		Validator validator =	validation.getValidator();
//		Set<ConstraintViolation<Object>>  ConstraintViolation =	validator.validate(dto);
//		if(ConstraintViolation.isEmpty()) {
		boolean update = repo.update(firstName, lastname, dateOfBirth, email, phoneNumber, gender, passward);
		System.out.println(update);
//		}else {
//			System.out.println("error in save");
//			System.out.println(ConstraintViolation);
//		}
		return false;
	}

	@Override
	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		repo.delete(id);
		return false;
	}

}
