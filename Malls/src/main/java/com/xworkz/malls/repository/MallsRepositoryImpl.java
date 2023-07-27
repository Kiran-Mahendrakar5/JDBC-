package com.xworkz.malls.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.malls.dto.MallsDto;

public class MallsRepositoryImpl implements MallsRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Malls");

	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(MallsDto dto) {
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		em.persist(dto);
		transtion.commit();
		return true;
	}

	@Override
	public List<MallsDto> readAll() {
		Query query = em.createNamedQuery("ReadAll");
		return query.getResultList();

	}

	@Override
	public MallsDto findById(int id) {
		MallsDto dto = em.find(MallsDto.class, id);
		return dto;
	}

	@Override
	public MallsDto findByName(String Name) {
		Query query = em.createNamedQuery("findByName");
		Query quaryg = query.setParameter("name", Name);
		MallsDto dto = (MallsDto) quaryg.getSingleResult();

		return dto;
	}

	@Override
	public boolean updateByNameAndId(int id, String Name) {
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		Query query = em.createNamedQuery("updatenameById");
		query.setParameter("id", id);
		query.setParameter("nm", Name);
		query.executeUpdate();
		transtion.commit();

		return true;
	}

	@Override
	public boolean DeleteById(int id) {
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		Query query = em.createNamedQuery("deleteById");
		query.setParameter("idr", id);
		query.executeUpdate();
	    transtion.commit();
		return true;
	}

}
