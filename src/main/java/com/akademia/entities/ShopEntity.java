package com.akademia.entities;

import java.util.List;

public class ShopEntity {

	private int id;
	private String name;
	private List<SectorEntity> sector;

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

	public List<SectorEntity> getSector() {
		return sector;
	}

	public void setSector(List<SectorEntity> sector) {
		this.sector = sector;
	}

}
