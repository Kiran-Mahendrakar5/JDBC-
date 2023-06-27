package com.xworkz.linkedIn.service;

import com.xworkz.linkedIn.dto.LinkedInDto;

public interface LinkedInService {
	public boolean validateAndSave(LinkedInDto dto);

	public boolean updateByEmail(String email, int id);

	public boolean readByEmail(String email, int id);

	public boolean readAll(int id);

	public boolean readByid(int id);

	public boolean readByEmail(String email);

	public boolean deleteById(int id);

	public boolean deleteByEmail(String email);

}
