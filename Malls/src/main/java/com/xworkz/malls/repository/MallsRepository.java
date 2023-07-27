package com.xworkz.malls.repository;

import java.util.List;

import com.xworkz.malls.dto.MallsDto;

public interface MallsRepository {
	
	public boolean save(MallsDto dto);

	public List<MallsDto> readAll();

	public MallsDto findById(int id);

	public MallsDto findByName(String Name);

//	public boolean updateById(int id);

	public boolean updateByNameAndId(int id, String Name);

	public boolean DeleteById(int id);

}
