package com.xworkz.facebook.service;

import com.xworkz.facebook.dto.facebookDto;

public interface facebookService {

	public boolean validateandSave(facebookDto dto);

	public boolean updateByProfile(int id, String Profile);

	public boolean readByProfile(String Profile);

	public boolean deleteByProfile(String Profile);

	public boolean readByIdandcloseFriend(int id, String closeFriend);

	public boolean readAll();

	

}
