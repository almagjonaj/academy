package com.akademia.dao;

import java.util.List;

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
		boolean userFound = false;

		try {
			TypedQuery<UserEntity> query = session
					.createQuery("from UserEntity as u where u.username=?1 and u.password=?2", UserEntity.class);
			query.setParameter(1, username);
			query.setParameter(2, password);
			List<UserEntity> list = query.getResultList();
			if ((list != null) && (list.size() > 0)) {
				userFound = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return userFound;

	}

	public void updateUser(UserEntity user) {
		try {

		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void deleteUser(List<UserEntity> user) {

	}

	public void insertUser(UserEntity user) {

	}
}
