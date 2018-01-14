package com.akademia.entities;

import java.util.List;

public class SectorEntity {

	private int id;
	private String name;
	private List<DepartmentEntity> department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DepartmentEntity> getDepartment() {
		return department;
	}

	public void setDepartment(List<DepartmentEntity> department) {
		this.department = department;
	}

}
