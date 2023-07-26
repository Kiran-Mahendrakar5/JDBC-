package com.xworkz.railwayss.service;

import java.util.List;

import com.xworkz.railwayss.dto.RailwayssDto;
import com.xworkz.railwayss.repository.RailwayssRepository;
import com.xworkz.railwayss.repository.RailwayssRepositoryImpl;

public class RailwayssServiceImpl implements RailwayssService {

	RailwayssRepository repo = new RailwayssRepositoryImpl();

	@Override
	public boolean save(RailwayssDto dto) {
		if (dto != null) {
			if (dto.getId() != 0) {
				if (dto.getLocation() != null) {
					if (dto.getPhoneNumber() != null) {
						if (dto.getRailwayssName() != null) {
							if (dto.getRating() != null) {
								repo.save(dto);
								System.out.println("dto is saved");
								return true;

							}
							System.out.println("rating is null");
							return false;
						}
						System.out.println("name is null");
						return false;
					}
					System.out.println("phoneNumber is null");
					return false;
				}
				System.out.println("location is null");
				return false;
			}
			System.out.println("id is zero");
			return false;
		}
		System.out.println("dto is null");
		return false;

	}

	@Override
	public List<RailwayssDto> readAll() {

		return repo.readAll();
	}

	@Override
	public RailwayssDto findById(int id) {
		if (id != 0) {
		System.out.println("validated id");
		return repo.findById(id);
		
		}
		return null;
	}

	@Override
	public RailwayssDto findByName(String RailwayssName) {
		if(RailwayssName!=null) {
			System.out.println("validated name");
			return repo.findByName(RailwayssName);
		}
		return null;
	}

	@Override
	public boolean updateById(int id) {
		if(id!=0) {
			System.out.println("validated id");
			return repo.updateById(id);
		}
		return false;
	}

	@Override
	public boolean updateByNameAndId(int id, String RailwayssName) {
		if(id!=0) {
			if(RailwayssName !=null) {
				System.out.println("validated id and RailwayssName");
				return repo.updateByNameAndId(id, RailwayssName);
			}
		}
		return false;
	}

	@Override
	public boolean DeleteById(int id) {
		if(id!=0) {
			System.out.println("validated id");
		return repo.DeleteById(id);
		}
		return false;
	}

}
