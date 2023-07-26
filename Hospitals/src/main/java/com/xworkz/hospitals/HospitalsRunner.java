package com.xworkz.hospitals;

import java.util.List;

import com.xworkz.hospitals.dto.HospitalsDto;
import com.xworkz.hospitals.service.HospitalsService;
import com.xworkz.hospitals.service.HospitalsServiceImpl;

public class HospitalsRunner {

	public static void main(String[] args) {

		HospitalsService service = new HospitalsServiceImpl();

		HospitalsDto dto = new HospitalsDto(1, "MSramaiya", "shalan", "sharma");
		HospitalsDto dto1 = new HospitalsDto(2, "narayanas", "sachin", "vijay");
		HospitalsDto dto2 = new HospitalsDto(3, "tulasi", "vidya", "vikranth");
		HospitalsDto dto3 = new HospitalsDto(4, "megghan", "bhuvan", "punith");
		HospitalsDto dto4 = new HospitalsDto(5, "ravi", "ramya", "arun");

//     	service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);

//		List<HospitalsDto> list = service.readAll();
//		list.forEach((ref) -> {
//			System.out.println(ref);
//		});
 
//		HospitalsDto  find =service.findById(5);
//		System.out.println(find);

//		HospitalsDto findname = service.findByName("'megghan'");
//		System.out.println(findname);

//		boolean result = service.updateById(3);
//		System.out.println(result);

//		boolean upt = service.updateByNameAndId(3, "peopletree");
//		System.out.println(upt);

//		boolean delete = service.DeleteById(2);
//		System.out.println(delete);

	}

}
