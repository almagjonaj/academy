package com.akademia.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class DepartmentEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	private List<CompanyEntity> company;

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

	public List<CompanyEntity> getCompany() {
		return company;
	}

	public void setCompany(List<CompanyEntity> company) {
		this.company = company;
	}

}
