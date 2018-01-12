package com.akademia.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory session = buildSessionFactoryObj();

	public static SessionFactory buildSessionFactoryObj() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}

	}

	public static SessionFactory getSessionFactory() {
		return session;
	}

}
