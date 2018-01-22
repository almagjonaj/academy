package com.akademia.service;

import java.util.List;

import com.akademia.entities.UserEntity;


abstract  public class UserService {

	abstract public  boolean validateUser(String username, String password);
	abstract  public  List<UserEntity> getAll();
	

}
