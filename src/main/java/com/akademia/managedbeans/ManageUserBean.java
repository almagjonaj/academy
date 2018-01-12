package com.akademia.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import com.akademia.dao.UserDao;
import com.akademia.entities.UserEntity;
import com.akademia.pojo.UserLoginRequest;
import com.akademia.service.UserService;
import com.akademia.util.PageRedirectUtil;

@ViewScoped
@ManagedBean(name = "manageUserBean")
public class ManageUserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static UserService userService = new UserService();

	private UserLoginRequest entity = new UserLoginRequest();

	private static UserDao userDao = new UserDao();
	private List<UserEntity> users;

	private String name;

	@PostConstruct
	public void init() {
		users = userService.getAll();
	}

	public String validateLogin() {
		FacesMessage msg = null;
		boolean isvalid = userDao.validateUser(entity.getUsername(), entity.getPassword());
		if (isvalid) {
			return PageRedirectUtil.USER;
		} else {
			msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Error", "Not Logined");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		return null;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserLoginRequest getEntity() {
		return entity;
	}

	public void setEntity(UserLoginRequest entity) {
		this.entity = entity;
	}

}
