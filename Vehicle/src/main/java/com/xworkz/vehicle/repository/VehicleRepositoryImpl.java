package com.xworkz.vehicle.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Transaction;

import com.xworkz.vehicle.dto.VehicleDto;

public class VehicleRepositoryImpl implements VehicleRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vehicle");

	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(VehicleDto dto) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		return true;
	}

	@Override
	public List<VehicleDto> readAll() {

		Query query1 = em.createNamedQuery("readAll");
		return query1.getResultList();
	}

	@Override
	public VehicleDto findByname(String name) {
		Query query2 = em.createNamedQuery("findByname");
		 query2.setParameter("nm", name);
		VehicleDto dto = (VehicleDto) query2.getSingleResult();
		return dto;
	}

	@Override
	public VehicleDto finfByconsumeAndType(String type,String consume) {
		Query query4 = em.createNamedQuery("findBycm");
	Query value =	query4.setParameter("ty", type).setParameter("cm", consume);

		VehicleDto dto = (VehicleDto) value.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateTypeByname(String name, String type) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query queryy = em.createNamedQuery("updattynam");
		queryy.setParameter("tpe", type);
		queryy.setParameter("nm", name);
		queryy.executeUpdate();
		transaction.commit();
		return true;
	}

	@Override
	public boolean updatelounchedAndpowerById(int id, String power, String lounched) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query queryy = em.createNamedQuery("updateloudAndpwrById");
		queryy.setParameter("ln", lounched).setParameter("pw", power).setParameter("ids", id);
		queryy.executeUpdate();
		transaction.commit();
		return true;

	}

	@Override
	public boolean deleteBylounched(String lounched) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query queryy = em.createNamedQuery("deleteBylounched");
		 queryy.setParameter("ln", lounched);
		 queryy.executeUpdate();
		 transaction.commit();
		return true;
	}
	

}
