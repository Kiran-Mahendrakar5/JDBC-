package com.xworkz.facebook;

import java.sql.Date;

import com.xworkz.facebook.dto.facebookDto;
import com.xworkz.facebook.service.facebookService;
import com.xworkz.facebook.service.facebookServiceImpl;

public class Runner {
	
	public static void main(String[] args) {
		
//		Date date = new Date(2003,2,3);
		
		facebookDto dto = new facebookDto();
		dto.setId(6);
//		dto.setDate(date);
		dto.setProfile("kiran");
		dto.setCloseFriend("kishan");
		dto.setPost(15);
		dto.setMutualFriends(55);
		dto.setLogInPassward(123456);
		dto.setSharedPost(21);
		
		
		facebookService service = new facebookServiceImpl();
//		service.validateandSave(dto);
		
		service.updateByFacebookProfile(2, "kishan");
		
	}

}
