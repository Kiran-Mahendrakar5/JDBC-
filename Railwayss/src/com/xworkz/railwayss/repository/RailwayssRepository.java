package com.xworkz.railwayss.repository;

import java.util.List;

import com.xworkz.railwayss.dto.RailwayssDto;

public interface RailwayssRepository {
	
public boolean save(RailwayssDto dto);
	
	public List<RailwayssDto> readAll();
	
	public RailwayssDto findById(int id);
	
	public RailwayssDto findByName(String RailwayssName);
	
	public boolean updateById(int id);
	
	public boolean updateByNameAndId(int id,String RailwayssName);
	
	public boolean DeleteById(int id);

}
