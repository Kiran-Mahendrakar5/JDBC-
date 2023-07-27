package com.xworkz.vehicle.repository;

import java.util.List;

import com.xworkz.vehicle.dto.VehicleDto;

public interface VehicleRepository {
	
	public boolean save(VehicleDto dto);
	
	public List<VehicleDto> readAll();
	
	public VehicleDto findByname(String name);
	
	public VehicleDto finfByconsumeAndType(String power,String type);
	
	public boolean  updateTypeByname(String name,String type);
	
	public boolean updatelounchedAndpowerById(int id,String power,String lounched);
	
	public boolean deleteBylounched(String lounched);

}
