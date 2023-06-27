package com.xworkz.whatsapp.dto;

public class whatsappDto {

	private int id;
	private String name;
	private int password;
	private String achiveContact;
	private int noOfContact;
	private String statusName;
	
	
	
	
	public whatsappDto() {
		super();
	
	}


	@Override
	public String toString() {
		return "whatsappDto [id=" + id + ", name=" + name + ", password=" + password + ", achiveContact="
				+ achiveContact + ", noOfContact=" + noOfContact + ", statusName=" + statusName + "]";
	}


	public whatsappDto(int id, String name, int password, String achiveContact, int noOfContact, String statusName) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.achiveContact = achiveContact;
		this.noOfContact = noOfContact;
		this.statusName = statusName;
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


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}


	public String getAchiveContact() {
		return achiveContact;
	}


	public void setAchiveContact(String achiveContact) {
		this.achiveContact = achiveContact;
	}


	public int getNoOfContact() {
		return noOfContact;
	}


	public void setNoOfContact(int noOfContact) {
		this.noOfContact = noOfContact;
	}


	public String getStatusName() {
		return statusName;
	}


	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	
	
	

}
