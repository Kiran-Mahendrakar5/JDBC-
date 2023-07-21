package com.xworkz.news.service;

import java.util.List;

import com.xworkz.news.dto.NewsDto;
import com.xworkz.news.repository.NewsRepository;
import com.xworkz.news.repository.NewsRepositoryImpl;

public class NewsServiceImpl implements NewsService {

	NewsRepository repo = new NewsRepositoryImpl();

	@Override
	public boolean save(NewsDto dto) {
		if (dto != null) {
			if (dto.getId() != 0) {
				if (dto.getChannelName() != null & dto.getChannelName().length() > 3) {
					if (dto.getLanguage() != null & dto.getLanguage().length() > 3) {
						if (dto.getNewType() != null & dto.getNewType().length() > 3) {
							if (dto.getDate() != null & dto.getDate().length() > 3) {
								repo.save(dto);
								return true;

							}
							System.out.println("get date is null");
							return false;

						}
						System.out.println("get newType is null");
						return false;

					}
					System.out.println("get language is null");
					return false;
				}
				System.out.println("get channelName is null");
				return false;
			}
			System.out.println("get Idis 0");
			return false;
		}
		System.out.println("dto is null");
		return false;

	}

	@Override
	public NewsDto findByid(int id) {
		if(id>0) {
			System.out.println("valid id");
			return repo.findByid(id);
			
			
		}
		return null;
		
	}

	@Override
	public List<NewsDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public boolean deleteById(int id) {
		if(id>0) {
			System.out.println("valid id");
			repo.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public NewsDto FindByName(String channelName) {
		if(channelName!=null) {
			System.out.println("name is validate");
			return repo.FindByName(channelName);
			
		}
		return null;
	}

	@Override
	public boolean updatelanguagebyid(String language, int id) {
	  if(id>0) {
		  if(language!=null) {
			  System.out.println("validated");
			  repo.updatelanguagebyid(language, id);
			  return true;
		  }
	  }
		return false;
	}

	





}
