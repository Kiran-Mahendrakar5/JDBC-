package com.xworkz.news;

import java.util.List;

import com.xworkz.news.dto.NewsDto;
import com.xworkz.news.service.NewsService;
import com.xworkz.news.service.NewsServiceImpl;

public class NewsReader {

	public static void main(String[] args) {

		NewsService service = new NewsServiceImpl();

		NewsDto dto = new NewsDto(1, "publicNews", "sports", "spanish", "19/3/23");
		NewsDto dto1 = new NewsDto(2, "News18India", "election", "english", "22/3/23");
		NewsDto dto2 = new NewsDto(3, "ZeeNews", "festival", "hindi", "23/3/23");
		NewsDto dto3 = new NewsDto(4, "IndiaTV", "coronavirus", "telugu", "24/3/23");
		NewsDto dto4 = new NewsDto(5, "AsianetNews", "coronavirusvaccine", "tamil", "25/3/23");

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		System.out.println("===================findByid(2)=========================");
//		NewsDto find = service.findByid(2);
//		System.out.println(find);
//
//		System.out.println("===================readAll()=========================");
//		service.readAll();
//
//		System.out.println("===================deleteById(5)=========================");
//		boolean status = service.deleteById(5);
//		System.out.println(status);

//		NewsDto fndnme = service.FindByName("'News18India'");
//		System.out.println(fndnme);

		boolean result = service.updatelanguagebyid("'spanish'", 4);
		System.out.println(result);

	}

}
