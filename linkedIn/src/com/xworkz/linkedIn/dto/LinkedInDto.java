package com.xworkz.linkedIn.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LinkedInDto {
	
	private int id;
	@NotBlank
	@NotNull
	@Size(min=3,max=15)
	private String profile;
	@NotBlank
	@NotNull
	@Size(min=3,max=15)
	private String firstName;
	@NotBlank
	@NotNull
	@Size(min=3,max=15)
	private String lastName;
	@NotBlank
	@NotNull
	private String qulaification;
	@NotBlank
	@NotNull
	private String skills;
	@NotBlank
	@NotNull
	@Email
	private String gmail;
	@NotBlank
	@NotNull
	@Size(min=3,max=15)
	private String mutualFreinds;
//	@NotBlank
//	@NotEmpty
	private Long phoneNumber;
	@NotBlank
	@NotNull
	private String viewedPeople;
	@NotBlank
	@NotNull
	private String savedPDF;
	@NotBlank
	@NotNull
	private String jobs;
//	@NotBlank
//	@NotEmpty
	private Integer logInPassward;
	@NotBlank
	
	private String location;
	@NotBlank
	@NotNull
	private String school;
	@NotBlank
	@NotNull
	private String college;
	
	
	
	public LinkedInDto() {
		super();

	}




	public LinkedInDto(int id, String profile, String firstName, String lastName, String qulaification, String skills,
			String gmail, String mutualFreinds, long phoneNumber, String viewedPeople, String savedPDF, String jobs,
			int logInPassward, String location, String school, String college) {
		super();
		this.id = id;
		this.profile = profile;
		this.firstName = firstName;
		this.lastName = lastName;
		this.qulaification = qulaification;
		this.skills = skills;
		this.gmail = gmail;
		this.mutualFreinds = mutualFreinds;
		this.phoneNumber = phoneNumber;
		this.viewedPeople = viewedPeople;
		this.savedPDF = savedPDF;
		this.jobs = jobs;
		this.logInPassward = logInPassward;
		this.location = location;
		this.school = school;
		this.college = college;
	}





	@Override
	public String toString() {
		return "LinkedInDto [id=" + id + ", profile=" + profile + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", qulaification=" + qulaification + ", skills=" + skills + ", gmail=" + gmail + ", mutualFreinds="
				+ mutualFreinds + ", phoneNumber=" + phoneNumber + ", viewedPeople=" + viewedPeople + ", savedPDF="
				+ savedPDF + ", jobs=" + jobs + ", logInPassward=" + logInPassward + ", location=" + location
				+ ", school=" + school + ", college=" + college + "]";
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getProfile() {
		return profile;
	}




	public void setProfile(String profile) {
		this.profile = profile;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getQulaification() {
		return qulaification;
	}




	public void setQulaification(String qulaification) {
		this.qulaification = qulaification;
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




	public String getMutualFreinds() {
		return mutualFreinds;
	}




	public void setMutualFreinds(String mutualFreinds) {
		this.mutualFreinds = mutualFreinds;
	}




	public long getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getViewedPeople() {
		return viewedPeople;
	}




	public void setViewedPeople(String viewedPeople) {
		this.viewedPeople = viewedPeople;
	}




	public String getSavedPDF() {
		return savedPDF;
	}




	public void setSavedPDF(String savedPDF) {
		this.savedPDF = savedPDF;
	}




	public String getJobs() {
		return jobs;
	}




	public void setJobs(String jobs) {
		this.jobs = jobs;
	}




	public int getLogInPassward() {
		return logInPassward;
	}




	public void setLogInPassward(int logInPassward) {
		this.logInPassward = logInPassward;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public String getSchool() {
		return school;
	}




	public void setSchool(String school) {
		this.school = school;
	}




	public String getCollege() {
		return college;
	}




	public void setCollege(String college) {
		this.college = college;
	}
	
	
	
	
	
	

}
