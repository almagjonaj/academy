package com.akademia.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
	private List<CountryEntity> country;

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

	public List<CountryEntity> getCountry() {
		return country;
	}

	public void setCountry(List<CountryEntity> country) {
		this.country = country;
	}

}
