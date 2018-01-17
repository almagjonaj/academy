package com.akademia.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.akademia.dao.UserDao;
import com.akademia.entities.UserEntity;
import com.akademia.service.UserService;

@ViewScoped
@ManagedBean(name = "manageUserBean")
public class ManageUserBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static UserService userService = new UserService();
	private UserEntity entity = new UserEntity();
	private UserDao userDao = new UserDao();
	private List<UserEntity> users;

	@PostConstruct
	public void init() {
		users = userService.getAll();
	}

	public String validateLogin() {
		boolean isvalid = userDao.validateUser(entity.getUsername(), entity.getPassword());
		if (isvalid) {
			return "private/user/index.xhtml?faces-redirect=true";
		} else {
			return "login.xhtml?faces-redirect=true";
		}
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

	public UserEntity getEntity() {
		return entity;
	}

	public void setEntity(UserEntity entity) {
		this.entity = entity;
	}
	
	

}
