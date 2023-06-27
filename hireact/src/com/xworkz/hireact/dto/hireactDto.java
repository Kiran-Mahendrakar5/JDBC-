package com.xworkz.hireact.dto;

import lombok.AllArgsConstructor;

public class hireactDto {
	
	
	
	private int id;
	private String name;
	private String qualification;
	private String skills;
	private String gmail;
	
	@Override
	public String toString() {
		return "hireactDto [id=" + id + ", name=" + name + ", qualification=" + qualification + ", skills=" + skills
				+ ", gmail=" + gmail + "]";
	}

	public hireactDto() {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.skills = skills;
		this.gmail = gmail;
	}

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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	
	
	
	
	
	

}
