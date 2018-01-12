package com.akademia.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.akademia.util.HibernateUtil;

public abstract class GenericDao<T> {
	
	public void add(T t) {
		Transaction trans = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trans = session.beginTransaction();
			session.save(t);
			session.getTransaction().commit();
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
		}
	}

	public boolean remove(T t) {
		Transaction trans = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trans = session.beginTransaction();
			session.remove(t);
			session.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
		}
		return false;
	}

	public boolean edit(T t) {
		Transaction trans = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			trans = session.beginTransaction();
			session.saveOrUpdate(t);
			session.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (trans != null) {
				trans.rollback();
			}
		}
		return false;
	}

}
