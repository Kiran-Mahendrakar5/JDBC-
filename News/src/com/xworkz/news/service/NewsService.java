package com.xworkz.news.service;

import java.util.List;

import com.xworkz.news.dto.NewsDto;

public interface NewsService {
	
	public boolean save(NewsDto dto);

	public NewsDto findByid(int id); 
	
	public List<NewsDto> readAll();
	
	public boolean deleteById(int id);
	
	public NewsDto FindByName(String channelName);
	
	public boolean updatelanguagebyid(String language,int id);
	

	
	
	
	
	
	
	
	
	

}
