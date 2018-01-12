package com.akademia.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.akademia.entities.UserEntity;
import com.akademia.util.HibernateUtil;

public class UserDao extends GenericDao<UserEntity> {

	private Session session = HibernateUtil.getSessionFactory().openSession();

	public UserEntity getUserById(int id) {
		return null;
	}

	public List<UserEntity> getAll() {
		try {
			TypedQuery<UserEntity> query = session.createQuery("from UserEntity u ", UserEntity.class);
			List<UserEntity> lista = query.getResultList();
			return lista;
		} catch (Exception e) {
			System.out.println("Error message: " + e.getMessage());
			return null;
		}
	}

	public boolean validateUser(String username, String password) {
		try {
			Query query = session.createQuery("from UserEntity u where u.username=?1 and u.password=?2");
			query.setParameter(1, username);
			query.setParameter(2, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return true;

	}

	public void deleteRole() {
		Query query = session.createQuery("delete r from RoleEntity r where r.id = 1");
		query.executeUpdate();
	}
}
