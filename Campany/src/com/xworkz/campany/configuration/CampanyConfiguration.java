package com.xworkz.campany.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.campany.dto.CampanyDto;

public class CampanyConfiguration {

	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {

		if (sessionfactory==null) {

			Properties pro = new Properties();
			
			
			pro.put(Environment.URL, "jdbc:mysql://localhost:3306/Campany");
			pro.put(Environment.USER, "root");
			pro.put(Environment.PASS, "Xworkzodc@123");
			pro.put(Environment.SHOW_SQL, "true");
//			pro.put(Environment.HBM2DDL_AUTO, "create");
			pro.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");

			Configuration confi = new Configuration();
			confi.setProperties(pro);

			confi.addAnnotatedClass(CampanyDto.class);

			ServiceRegistry serreg = new StandardServiceRegistryBuilder().applySettings(confi.getProperties()).build();

			sessionfactory = confi.buildSessionFactory(serreg);
			
			return sessionfactory;
		}
		return sessionfactory;

	}

}
