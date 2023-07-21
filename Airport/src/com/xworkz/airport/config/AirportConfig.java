package com.xworkz.airport.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.airport.dto.AirportDto;

public class AirportConfig {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

//		Properties
			Properties prop = new Properties();

			prop.put(Environment.URL, "jdbc:mysql://localhost:3306/news");
			prop.put(Environment.USER, "root");
			prop.put(Environment.PASS, "Xworkzodc@123");
			prop.put(Environment.SHOW_SQL, "true");
//			prop.put(Environment.HBM2DDL_AUTO, "create");
			prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");

//		Configuration
			Configuration confi = new Configuration();

			confi.setProperties(prop);

			confi.addAnnotatedClass(AirportDto.class);

			ServiceRegistry serreg = new StandardServiceRegistryBuilder().applySettings(confi.getProperties()).build();

			sessionFactory = confi.buildSessionFactory(serreg);

			return sessionFactory;

		}
		return sessionFactory;

	}
}