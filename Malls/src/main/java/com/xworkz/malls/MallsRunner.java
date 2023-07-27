package com.xworkz.malls;

import java.util.List;

import com.xworkz.malls.dto.MallsDto;
import com.xworkz.malls.service.MallsService;
import com.xworkz.malls.service.MallsServiceImpl;

public class MallsRunner {

	public static void main(String[] args) {

		MallsService service = new MallsServiceImpl();

		MallsDto dto = new MallsDto(1, "orion", "five", "bangalore", "9738878979");
		MallsDto dto1 = new MallsDto(2, "Nexus ", "six", "Tumkur", "8738878979");
		MallsDto dto2 = new MallsDto(3, "UbCity", "seven", "davangere", "7738878979");
		MallsDto dto3 = new MallsDto(4, "Forum", "eight", "chikkabalapur", "9938878979");
		MallsDto dto4 = new MallsDto(5, "MantriSquare", "nine", "yalanka", "6538878979");

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);

		List<MallsDto> read =	service.readAll();
		read.forEach((reading) -> {System.out.println(reading);});

		MallsDto find =	service.findById(5);
		System.out.println(find);

		MallsDto finded = service.findByName("Forum");
		System.out.println(finded);

		boolean result = service.updateByNameAndId(3, "kiran");
		System.out.println(result);
		
		
		boolean status = service.DeleteById(2);
		System.out.println(status);

	}

}
