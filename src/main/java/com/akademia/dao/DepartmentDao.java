package com.akademia.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.akademia.entities.DepartmentEntity;
import com.akademia.util.HibernateUtil;

public class DepartmentDao extends GenericDao<DepartmentEntity> {

	private Session session = HibernateUtil.getSessionFactory().openSession();

	public List<DepartmentEntity> getAllDept() {
		try {
			TypedQuery<DepartmentEntity> query = session.createQuery("from DepartmentEntity e",
					DepartmentEntity.class);
			List<DepartmentEntity> list = query.getResultList();
			return list;

		} catch (Exception e) {
			System.out.println("Error message: " + e.getMessage());
			return null;
		}
		
	}

}
