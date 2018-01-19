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
		return "private/user/index.xhtml?faces-redirect=true";
	}

	public String redirectToWelcome() {
		return "";
	}

	public String redirectToBrandManager() {
		return "private/manager/brandManager.xhtml?faces-redirect=true";
	}

	public String redirectToDepartmentManager() {
		return "private/manager/departmentManager.xhtml?faces-redirect=true";
	}

	public String redirectToSectorManager() {
		return "private/manager/sectorManager.xhtml?faces-redirect=true";
	}

	public String redirectToShopManager() {
		return "private/manager/shopManager.xhtml?faces-redirect=true";
	}

	public String redirectToAdminPage() {
		return "private/admin/admin.xhtml?faces-redirect=true";
	}

}
