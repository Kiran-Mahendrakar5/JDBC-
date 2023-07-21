package com.xworkz.news.repository;

import java.util.List;

import com.xworkz.news.dto.NewsDto;

public interface NewsRepository {
	
	public boolean save(NewsDto dto);
	
	public NewsDto findByid(int id); 
	
	public List<NewsDto> readAll();
	
	public boolean deleteById(int id);
	
	public NewsDto FindByName(String channelName);
	
	public boolean updatelanguagebyid(String language,int id);

}
