package com.akademia.util;

public class PageRedirectUtil {

	public String redirectToLogin() {
		return "private/user/index.xhtml?faces-redirect=true";
	}

	public String redirectToWelcome() {
		return "";
	}
/*
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
	*/

	public String redirectToAdminPage() {
		return "private/admin/admin.xhtml?faces-redirect=true";
	}

}
