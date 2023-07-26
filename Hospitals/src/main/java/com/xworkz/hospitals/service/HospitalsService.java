package com.xworkz.hospitals.service;

import java.util.List;

import com.xworkz.hospitals.dto.HospitalsDto;

public interface HospitalsService {

	public boolean save(HospitalsDto dto);

	public List<HospitalsDto> readAll();

	public HospitalsDto findById(int id);

	public HospitalsDto findByName(String HospitalName);

	public boolean updateById(int id);

	public boolean updateByNameAndId(int id, String HospitalName);

	public boolean DeleteById(int id);

}
