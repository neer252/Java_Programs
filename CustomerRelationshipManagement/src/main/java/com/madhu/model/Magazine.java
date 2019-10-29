package com.madhu.model;

import java.util.List;

public class Magazine {
	private String name;
	private int noOfPages;
	private MagazineType magazineType;
	private List<Author> authorList;

	public MagazineType getMagazineType() {
		return magazineType;
	}

	public void setMagazineType(MagazineType magazineType) {
		this.magazineType = magazineType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

}
