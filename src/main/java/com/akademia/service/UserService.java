package com.akademia.service;

import java.util.List;

import com.akademia.dao.UserDao;
import com.akademia.entities.UserEntity;

public class UserService {

	private static UserDao userDao = new UserDao();

	/*public void addUser(UserEntity user) {
		userDao.add(user);
	}*/

	public List<UserEntity> getAll() {
		return userDao.getAll();
	}

}
