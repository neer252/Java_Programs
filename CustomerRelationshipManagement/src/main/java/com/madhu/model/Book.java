package com.madhu.model;

import java.util.List;

public class Book extends PrintedMedium {

	private String name;
	private int pageNo;
	private MagazineType magazineType;
	private List<Author> authorList;
	
	
	public MagazineType getMagazineType() {
		return magazineType;
	}

	public void setMagazineType(MagazineType magazineType) {
		this.magazineType = magazineType;
	}

	public List<Author> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

}
