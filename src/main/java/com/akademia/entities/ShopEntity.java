package com.akademia.entities;

import java.util.List;

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
import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class ShopEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@ManyToOne(fetch = FetchType.LAZY)
	private SectorEntity sector;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "country_shop", joinColumns = {
			@JoinColumn(name = "shopId", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "countryId", referencedColumnName = "id") })
	private List<CountryEntity> countries;

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

	public SectorEntity getSector() {
		return sector;
	}

	public void setSector(SectorEntity sector) {
		this.sector = sector;
	}

	public List<CountryEntity> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryEntity> countries) {
		this.countries = countries;
	}

}
