package com.xworkz.news.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.news.config.NewsConfig;
import com.xworkz.news.dto.NewsDto;

public class NewsRepositoryImpl implements NewsRepository {

	SessionFactory sefoc = NewsConfig.getSessionFactory();

	@Override
	public boolean save(NewsDto dto) {

		Session session = sefoc.openSession();

		Transaction tracst = session.getTransaction();
		tracst.begin();
		session.save(dto);
		tracst.commit();
		session.close();

		return true;
	}

	@Override
	public NewsDto findByid(int id) {
		Session session = sefoc.openSession();
		NewsDto dto = session.get(NewsDto.class, id);
		return dto;
	}

	@Override
	public List<NewsDto> readAll() {
		Session session = sefoc.openSession();
		Query<NewsDto> query = session.createQuery("from NewsDto", NewsDto.class);
//		Query quary = session.createQuery(" From NewsDto");
		List<NewsDto> listt = query.list();
		for (NewsDto frec : listt) {
			System.out.println(frec);

		}

		return listt;
	}

	@Override
	public boolean deleteById(int id) {
		Session session = sefoc.openSession();
		Transaction transaction = session.beginTransaction();
		NewsDto dto = findByid(id);
		session.delete("NewsDto", dto);
		transaction.commit();
		session.close();

		return true;
	}

	@Override
	public NewsDto FindByName(String channelName) {
		Session session = sefoc.openSession();
		String quary = "from NewsDto where channelName =" + channelName;
		Query<NewsDto> reader = session.createQuery(quary, NewsDto.class);
		NewsDto singnd = reader.getSingleResult();

		return singnd;
	}

	@Override
	public boolean updatelanguagebyid(String language, int id) {
		Session session = sefoc.openSession();
		Transaction transaction = session.beginTransaction();
		String query = "from NewsDto where id= "+id;
		Query<NewsDto> reader1 =	session.createQuery(query, NewsDto.class);
		NewsDto singnd1 = reader1.getSingleResult();
		transaction.commit();
		session.close();

	
		
	
		return true;
	}



}
