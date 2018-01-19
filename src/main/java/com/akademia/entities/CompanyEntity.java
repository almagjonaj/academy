package com.akademia.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class CompanyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "nipt")
	private String nipt;
	@Column(name = "address")
	private String address;
	@OneToMany(cascade = CascadeType.ALL)
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

	public String getNipt() {
		return nipt;
	}

	public void setNipt(String nipt) {
		this.nipt = nipt;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<DepartmentEntity> getDepartment() {
		return department;
	}

	public void setDepartment(List<DepartmentEntity> department) {
		this.department = department;
	}

}
