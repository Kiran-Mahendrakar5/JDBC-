package com.xworkz.facebooks.dto;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class facebooksDto {
	
	private Integer id;
	@NotBlank
	@NotNull
	private String firstName;
	@NotBlank
	@NotNull
	private String lastname;
	@NotBlank
	@NotNull
	private String dateOfBirth;
	@NotBlank
	@NotNull
	@Email
	private String email;
//	@NotBlank
//	@NotEmpty
//	@Size(min=10)
	private Long phoneNumber;
	@NotBlank
	@NotNull
	private String gender;
//	@NotBlank
//	@NotEmpty
//	@Size(min=8,max=16)
	private Long passward;
	
	
	public facebooksDto() {
		super();
		
	}


	public facebooksDto(int id, String firstName, String lastname, String dateOfBirth, String email, long phoneNumber,
			String gender, Long passward) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.passward = passward;
	}


	@Override
	public String toString() {
		return "facebooksDto [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", dateOfBirth="
				+ dateOfBirth + ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender
				+ ", passward=" + passward + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Long getPassward() {
		return passward;
	}


	public void setPassward(Long passward) {
		this.passward = passward;
	}
	
	

}
