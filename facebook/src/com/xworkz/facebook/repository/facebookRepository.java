package com.xworkz.facebook.repository;

import com.xworkz.facebook.dto.facebookDto;

public interface facebookRepository {

	public boolean validateandSave(facebookDto dto);

	public boolean updateByFacebookProfile(int id, String FacebookProfile);

	public boolean readByFacebookProfile(String FacebookProfile);

	public boolean deleteByFacebookProfile(String FacebookProfile);

	public boolean readByIdandcloseFriend(int id, String closeFriend);

	public boolean readAll();

}
