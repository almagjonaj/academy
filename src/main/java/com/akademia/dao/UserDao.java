package com.akademia.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.akademia.entities.UserEntity;
import com.akademia.util.HibernateUtil;
import com.akademia.util.LoggingUtils;


public class UserDao  extends GenericDao<UserEntity>  {

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
			LoggingUtils.LOG_AKADEMIA.error("Exception: {} ",e.getMessage());
			return null;
		}
	}

	public boolean validateUser(String username, String password) {
		boolean userFound = false;
		try {
			session.beginTransaction();
			TypedQuery<UserEntity> query = session
					.createQuery("from UserEntity as u where u.username=?1 and u.password=?2", UserEntity.class);
			query.setParameter(1, username);
			query.setParameter(2, password);
			List<UserEntity> list = query.getResultList();
			if ((list != null) && (list.size() > 0)) {
				userFound = true;
			}
		} catch (Exception e) {
			LoggingUtils.LOG_AKADEMIA.error("Exception: {} ",e.getMessage());
		}
		return userFound;

	}

}
