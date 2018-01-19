package com.akademia.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sector")
public class SectorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@ManyToOne
	@JoinColumn(name = "departmentId")
	private DepartmentEntity dept;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "sector_brand", joinColumns = {
			@JoinColumn(name = "sectorId", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "brandId", referencedColumnName = "id") })
	private List<BrandEntity> brands;

	@OneToMany(cascade = CascadeType.ALL)
	private List<ShopEntity> shops;

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

	public DepartmentEntity getDept() {
		return dept;
	}

	public void setDept(DepartmentEntity dept) {
		this.dept = dept;
	}

	public List<BrandEntity> getBrands() {
		return brands;
	}

	public void setBrands(List<BrandEntity> brands) {
		this.brands = brands;
	}

}
