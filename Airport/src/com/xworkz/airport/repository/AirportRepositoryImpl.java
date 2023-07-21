package com.xworkz.airport.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.airport.config.AirportConfig;
import com.xworkz.airport.dto.AirportDto;

public class AirportRepositoryImpl implements AirportRepository {
	SessionFactory sefoc = AirportConfig.getSessionFactory();

	@Override
	public boolean save(AirportDto dto) {
		Session session = sefoc.openSession();

		Transaction tracst = session.getTransaction();
		tracst.begin();
		session.save(dto);
		tracst.commit();
		session.close();
		return true;
	}

	@Override
	public AirportDto findByRating(String rating) {
		Session session = sefoc.openSession();

		Transaction tracst = session.getTransaction();
		tracst.begin();
		String quary = "from AirportDto where rating = " + rating;
		Query<AirportDto> result = session.createQuery(quary, AirportDto.class);
		AirportDto sin = result.getSingleResult();

		tracst.commit();
		session.close();

		return sin;
	}

	@Override
	public boolean updatephoneNumberbyAirportName(String AirportName, String phoneNumber) {
		Session session = sefoc.openSession();

		Transaction tracst = session.beginTransaction();
		String quary = "from AirportDto where AirportName = " + AirportName;
		Query<AirportDto> update = session.createQuery(quary, AirportDto.class);
		AirportDto sing = update.getSingleResult();
		sing.setPhoneNumber(phoneNumber);
		session.update(sing);
		tracst.commit();
		session.close();
		return true;

	}

	@Override
	public boolean updateLocationAndRatingbyAirportName(String AirportName, String Rating, String Location) {
		Session session = sefoc.openSession();

		Transaction tracst = session.beginTransaction();
		String query = "From AirportDto where AirportName = " + AirportName;
		Query<AirportDto> query1 = session.createQuery(query, AirportDto.class);
		AirportDto dto = query1.getSingleResult();
		dto.setLocation(Location);
		dto.setRating(Rating);
		session.update(dto);
		tracst.commit();
		session.close();

		return true;
	}

	@Override
	public boolean Deletebyrating(String rating) {
		AirportDto dto = findByRating(rating);
		Session session = sefoc.openSession();

		Transaction tracst = session.beginTransaction();
		session.delete(dto);
		tracst.commit();
		session.close();
		return true;

	}

	@Override
	public List<AirportDto> readAll() {
		Session session = sefoc.openSession();
		Query<AirportDto> query = session.createQuery("from AirportDto", AirportDto.class);
		List<AirportDto> list = query.list();
		list.forEach((ref) -> {System.out.println(ref);});
		 return list;
	}

}
