package com.akademia.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.akademia.dao.DepartmentDao;
import com.akademia.entities.DepartmentEntity;

@ViewScoped
@ManagedBean
public class ManageDepartmentBean implements Serializable {

	private static final long serialVersionUID = 9004651368152390631L;
	private DepartmentDao dept = new DepartmentDao();
	private List<DepartmentEntity> department;

	@PostConstruct
	public void init() {
		department = dept.getAllDept();

	}

	public DepartmentDao getDept() {
		return dept;
	}

	public void setDept(DepartmentDao dept) {
		this.dept = dept;
	}

	public List<DepartmentEntity> getDepartment() {
		return department;
	}

	public void setDepartment(List<DepartmentEntity> department) {
		this.department = department;
	}

}
