package com.xworkz.campany;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.campany.configuration.CampanyConfiguration;
import com.xworkz.campany.dto.CampanyDto;


public class CampanyRunner {

	public static void main(String[] args) {

		SessionFactory factory = CampanyConfiguration.getSessionFactory();
		
		Session session =	factory.openSession();
		
		
		
		CampanyDto dto = new CampanyDto(1, "satva", "kiran@gmail.com", "marthahalli", 100);
		CampanyDto dto1 = new CampanyDto(2, "Microsoft", "kishan@gmail.com", "sarjapura", 150);
		CampanyDto dto2= new CampanyDto(3, "Adobe", "deepak@gmail.com", "tinfactary", 200);
		CampanyDto dto3 = new CampanyDto(4, "IBM", "kishor@gmail.com", "krpuran", 800);
		CampanyDto dto4 = new CampanyDto(5, "Intuit ", "aishu@gmail.com", "rainbow", 750);
//		CampanyDto dto5 = new CampanyDto(6, "VMware", "vm@gmail.com", "dasrahalli", 600);
//		CampanyDto dto6 = new CampanyDto(7, "Sage Group", "sage@gmail.com", "goraguntepalya", 500);
//		CampanyDto dto7 = new CampanyDto(8, "Xero", "kiran@gmail.com", "yeshawanthpura", 950);
//		CampanyDto dto8 = new CampanyDto(9, "Qualtrics", "qualtric@gmail.com", "nowrang", 201);
//		CampanyDto dto9 = new CampanyDto(10, "Callidus", "Callidus@gmail.com", "malleshwaram", 190);
		
//		Transaction tran =  session.beginTransaction();only for save 
		
		session.save(dto);
		session.save(dto1);
		session.save(dto2);
		session.save(dto3);
		session.save(dto4);
//		session.save(dto5);
//		session.save(dto6);
//		session.save(dto7);
//		session.save(dto8);
//		session.save(dto9);
		
		Query<CampanyDto> quetry = 	session.createQuery("from CampanyDto",CampanyDto.class);
		List<CampanyDto> list = quetry.list();
		for(CampanyDto ref:list) {
		System.out.println(ref);
		
		
		
//		tran.commit();
		session.close();
	}

}
}
