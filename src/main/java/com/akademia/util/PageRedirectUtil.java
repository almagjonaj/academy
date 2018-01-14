package com.akademia.util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PageRedirectUtil {

	public static final String USER = "user";
	public static final String MANAGER = "manager";
	public static final String ADMIN = "admin";

	public String redirectToLogin() {
		return "/user/index.xhtml?faces-redirect=true";
	}

	public String redirectToWelcome() {
		return "";
	}

	public String redirectToBrandManager() {
		return "";
	}

	public String redirectToDepartmentManager() {
		return "";
	}

	public String redirectToSectorManager() {
		return "";
	}

	public String redirectToShopManager() {
		return "";
	}

	public String redirectToAdminPage() {
		return "";
	}

}
