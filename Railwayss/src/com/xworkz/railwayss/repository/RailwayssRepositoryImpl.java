package com.xworkz.railwayss.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.railwayss.config.RailwayssConfig;
import com.xworkz.railwayss.dto.RailwayssDto;

public class RailwayssRepositoryImpl implements RailwayssRepository {

	SessionFactory sefoc = RailwayssConfig.getSessionFactory();

	@Override
	public boolean save(RailwayssDto dto) {
		Session session = sefoc.openSession();

		Transaction tracst = session.getTransaction();
		tracst.begin();
		session.save(dto);
		tracst.commit();
		session.close();

		return true;
	}

	@Override
	public List<RailwayssDto> readAll() {
		Session session = sefoc.openSession();
		Query<RailwayssDto> query = session.createQuery("from RailwayssDto", RailwayssDto.class);
		List<RailwayssDto> list = query.list();

		return list;
	}

	@Override
	public RailwayssDto findById(int id) {
		Session session = sefoc.openSession();
		RailwayssDto dto = session.find(RailwayssDto.class, id);

		return dto;
	}

	@Override
	public RailwayssDto findByName(String RailwayssName) {
		Session session = sefoc.openSession();
		String query = "from RailwayssDto where RailwayssName ="+RailwayssName;
		Query<RailwayssDto> find =session.createQuery(query, RailwayssDto.class);
		RailwayssDto dto =	find.getSingleResult();
		
		return dto;
	}

	@Override
	public boolean updateById(int id) {
		Session session = sefoc.openSession();
		Transaction tracst = session.getTransaction();
		tracst.begin();
		RailwayssDto dto = session.find(RailwayssDto.class, id);
		dto.setId(id);
		session.update(dto);
		return true;
	}

	@Override
	public boolean updateByNameAndId(int id, String RailwayssName) {
		Session session = sefoc.openSession();
		Transaction tracst = session.getTransaction();
		tracst.begin();
		RailwayssDto dto = session.find(RailwayssDto.class, id);
		dto.setId(id);
		String query ="from RailwayssDto where RailwayssName ="+RailwayssName;
		Query<RailwayssDto> query1 =session.createQuery(query, RailwayssDto.class);
		RailwayssDto singleresult  = query1.getSingleResult();
		singleresult.setRailwayssName(RailwayssName);
		session.update(singleresult);
		tracst.commit();
		session.close();
		
		return true;
	}

	@Override
	public boolean DeleteById(int id) {
		Session session = sefoc.openSession();
		Transaction tracst = session.getTransaction();
		tracst.begin();
		RailwayssDto dto = session.find(RailwayssDto.class, id);
		session.remove(dto);
		tracst.commit();
		session.close();
		return true;
	}

}
