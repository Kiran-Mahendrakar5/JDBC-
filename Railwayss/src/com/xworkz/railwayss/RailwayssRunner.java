package com.xworkz.railwayss;

import java.util.List;

import com.xworkz.railwayss.dto.RailwayssDto;
import com.xworkz.railwayss.service.RailwayssService;
import com.xworkz.railwayss.service.RailwayssServiceImpl;

public class RailwayssRunner {
	
	public static void main(String[] args) {
		
		RailwayssService  service = new RailwayssServiceImpl();
		
		RailwayssDto dto = new RailwayssDto(1, "Krishnarajapuram", "bangalore", "three", "9898788987");
		RailwayssDto dto1 = new RailwayssDto(2, "MysuruCityJunction", "mysore", "four", "8898788987");
		RailwayssDto dto2= new RailwayssDto(3, "YesvantpurJunction", "	Yesvantpur", "two", "9698788987");
		RailwayssDto dto3 = new RailwayssDto(4, "Davangerejunction", "Davangere", "five", "7798788987");
		RailwayssDto dto4 = new RailwayssDto(5, "TumkurJunction", "Tumkur", "five", "1998788987");
		
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
		
//		List<RailwayssDto> read =service.readAll();
//		read.forEach((ref) ->{System.out.println(ref);});
		
//		RailwayssDto  find =service.findById(4);
//		System.out.println(find);
		
//		RailwayssDto name =service.findByName("'TumkurJunction'");
//		System.out.println(name);
		
//		boolean update = service.updateById(5);
//		System.out.println(update);
		
//		boolean result = service.updateByNameAndId(3, "'YesvantpurJunction'");
//		System.out.println(result);
		
//		boolean status =service.DeleteById(2);
//		System.out.println(status);
		
	}

}
