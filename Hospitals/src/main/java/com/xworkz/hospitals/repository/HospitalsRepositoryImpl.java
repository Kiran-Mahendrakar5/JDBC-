package com.xworkz.hospitals.repository;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import com.xworkz.hospitals.dto.HospitalsDto;

public class HospitalsRepositoryImpl implements HospitalsRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hospitals");

	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(HospitalsDto dto) {
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		em.persist(dto);
		transtion.commit();
		return true;
	}

	@Override
	public List<HospitalsDto> readAll() {
		TypedQuery<HospitalsDto> queary = em.createQuery("from HospitalsDto", HospitalsDto.class);
		List<HospitalsDto> list = queary.getResultList();
		return list;
	}

	@Override
	public HospitalsDto findById(int id) {
		HospitalsDto dto = em.find(HospitalsDto.class, id);
		return dto;
	}

	@Override
	public HospitalsDto findByName(String HospitalName) {
		String query = "from HospitalsDto where HospitalName = " +HospitalName;
		TypedQuery<HospitalsDto> query1 = em.createQuery(query, HospitalsDto.class);
		HospitalsDto dto = query1.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateById(int id) {
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		HospitalsDto dto = em.find(HospitalsDto.class, id);
		dto.setId(id);
		em.merge(dto);
		transtion.commit();
		return true;
	}

	@Override
	public boolean updateByNameAndId(int id, String HospitalName) {
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		HospitalsDto dto = em.find(HospitalsDto.class, id);
		dto.setHospitalName(HospitalName);
		em.merge(dto);
		transtion.commit();
		return true;
	}

	@Override
	public boolean DeleteById(int id) {
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		HospitalsDto dto = em.find(HospitalsDto.class, id);
		em.remove(dto);
		transtion.commit();
		return true;
	}

}
