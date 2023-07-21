package com.xworkz.rummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.rummy.configuration.RummyConfiguration;
import com.xworkz.rummy.dto.RummyDto;

public class RummyRunner {

	public static void main(String[] args) {

		SessionFactory sefoc = RummyConfiguration.getSessionFactory();

		
		RummyDto dto1 = new RummyDto(1, "kishan", "kishan@gmail.com", 4, 2, 2500, 2000, 300);
		RummyDto dto2 = new RummyDto(2, "Kiran", "kiran@gmail.com", 4, 2, 1500, 1000, 200);
		RummyDto dto3 = new RummyDto(3, "aishu", "aishu@gmail.com", 4, 2, 500, 500, 100);
		RummyDto dto4 = new RummyDto(4, "Kishor", "kisor@gmail.com", 6, 2, 600, 2000, 300);
		RummyDto dto5 = new RummyDto(5, "deewan", "deewan@gmail.com", 7, 2, 4500, 1000, 200);
		RummyDto dto6 = new RummyDto(6, "raju", "raju@gmail.com", 4, 8, 400, 500, 100);
		
		Session session = sefoc.openSession();

		Transaction tracst = session.getTransaction();
		tracst.begin();

//		session.save(dto1);
//		session.save(dto2);
//		session.save(dto3);
//		session.save(dto4);
//		session.save(dto5);
//		session.save(dto6);
		


//		Criteria cryt = session.createCriteria(RummyDto.class);
//		List<RummyDto> list = cryt.list();
//		for(RummyDto ref:list) {
//			System.out.println(ref);
//		}
	Query<RummyDto> quetry = 	session.createQuery("from RummyDto",RummyDto.class);
	List<RummyDto> list = quetry.list();
	for(RummyDto ref:list) {
	System.out.println(ref);
	
	
	
		
//		Update name deepaktokiran
//		session.update(dto2);
		
//		remove
//		session.remove(dto3);
		
//		updated gmail
//		session.update(dto2);
	 
//		tracst.commit();
		session.close();
		
		

	}

	}
}

