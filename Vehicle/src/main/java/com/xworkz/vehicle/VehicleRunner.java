package com.xworkz.vehicle;

import java.util.List;

import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.service.VehicleService;
import com.xworkz.vehicle.service.VehicleServiceImpl;

public class VehicleRunner {

	public static void main(String[] args) {

		VehicleService service = new VehicleServiceImpl();

		VehicleDto dto = new VehicleDto(1, "Ktm", "abs", "13litre", " 250exc", "2015");
		VehicleDto dto1 = new VehicleDto(2, "btm", "fixedBid", "15litre", " 450exc", "2014");
		VehicleDto dto2 = new VehicleDto(3, "GT", "aircooler", "12litre", " 650exc", "2020");
		VehicleDto dto3 = new VehicleDto(4, "RE", "himalayan", "17litre", " 380exc", "2021");
		VehicleDto dto4 = new VehicleDto(5, "Duke", "rearview", "9litre", " 150exc", "2012");
		VehicleDto dto5 = new VehicleDto(6, "dominar", "withfoldindmir", "7litre", " 210exc", "2022");

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);

//	List<VehicleDto> list =	service.readAll();
//	list.forEach((read) ->{System.out.println(read);});
		
	
//		VehicleDto find = service.findByname("dominar");
//		System.out.println(find);//deleted
		

//		VehicleDto findcpow = service.finfByconsumeAndType("fixedBid", "15litre");
//		System.out.println(findcpow);

//		boolean result = service.updateTypeByname("Duke", "reareview");
//		System.out.println(result);

//		boolean result = service.updatelounchedAndpowerById(3, "655exc", "2023");
//		System.out.println(result);

//		boolean status = service.deleteBylounched("2022");
//		System.out.println(status);

	}

}
