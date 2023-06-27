package com.xworkz.paytm.repository;

import com.xworkz.paytm.dto.paytmDto;

public interface paytmRepository {
	public boolean validateAndSave(paytmDto dto);

	public boolean updateByEmail(String email, int id);

	public boolean readByEmail(String email, int id);

	public boolean readAll();

	public boolean readByEmail(String email);

	public boolean deleteById(int id);

	public boolean deleteByEmail(String email);

}
