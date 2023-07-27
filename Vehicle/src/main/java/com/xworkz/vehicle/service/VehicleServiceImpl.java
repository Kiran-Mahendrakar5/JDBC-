package com.xworkz.vehicle.service;

import java.util.List;

import com.xworkz.vehicle.dto.VehicleDto;
import com.xworkz.vehicle.repository.VehicleRepository;
import com.xworkz.vehicle.repository.VehicleRepositoryImpl;

public class VehicleServiceImpl implements VehicleService{

	VehicleRepository repo = new VehicleRepositoryImpl();
	@Override
	public boolean save(VehicleDto dto) {
		if(dto!=null) {
			if(dto.getId()!=0) {
				if(dto.getName()!=null) {
					if(dto.getConsume()!=null) {
						if(dto.getLounched()!=null) {
							if(dto.getPower()!=null) {
								if(dto.getType()!=null) {
									repo.save(dto);
									System.out.println("validated saved");
									return true;
									
								}
								System.out.println("type is null");
								return false;
							}
							System.out.println("power is null");
							return false;
						}
						System.out.println("lounched is null");
						return false;
					}
					System.out.println("consume is null");
					return false;
				}
				System.out.println("name is null");
				return false;
				
			}
			System.out.println("id is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public List<VehicleDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public VehicleDto findByname(String name) {
		if(name!=null) {
			System.out.println("name is validated");
			return repo.findByname(name);
		}
		return null;
	}

	@Override
	public VehicleDto finfByconsumeAndType(String type,String consume){
	if(consume!=null&&type!=null) {
		System.out.println("consume is validated");
		return repo.finfByconsumeAndType(consume, type);
	}
		return null;
	}

	@Override
	public boolean updateTypeByname(String name, String type) {
		if(name !=null&&type!=null) {
			System.out.println("name and tyep ia validated");
			repo.updateTypeByname(name, type);
			return true;
		}
		return false;
	}

	@Override
	public boolean updatelounchedAndpowerById(int id, String power, String lounched) {
		if(id!=0&&power!=null&&lounched!=null) {
			System.out.println("id and power and lounched is validated");
			repo.updatelounchedAndpowerById(id, power, lounched);
		}
		return false;
	}

	@Override
	public boolean deleteBylounched(String lounched) {
		if(lounched!=null) {
			System.out.println("lounched validated");
			repo.deleteBylounched(lounched);
			return true;
			
		}
		return false;
	}

}
