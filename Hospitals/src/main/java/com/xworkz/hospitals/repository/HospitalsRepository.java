package com.xworkz.hospitals.repository;

import java.util.List;

import com.xworkz.hospitals.dto.HospitalsDto;

public interface HospitalsRepository {

	
	public boolean save(HospitalsDto dto);

	public List<HospitalsDto> readAll();

	public HospitalsDto findById(int id);

	public HospitalsDto findByName(String HospitalName);

	public boolean updateById(int id);

	public boolean updateByNameAndId(int id, String HospitalName);

	public boolean DeleteById(int id);
}
