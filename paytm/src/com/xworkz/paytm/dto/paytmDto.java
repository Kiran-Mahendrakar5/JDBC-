package com.xworkz.paytm.dto;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class paytmDto {
	@NotBlank
	@NotEmpty
	private Integer id;
	@NotBlank
	@NotNull
	@Size(min=3,max=15)
	private String name; 
	@NotBlank
	@NotNull
	@Email
	private String gmail;
	@NotBlank
	@NotEmpty
	private Integer logInPassward;
	@NotBlank
	@NotEmpty
	private Integer transectionPin;
	@NotBlank
	@NotEmpty
	private Integer dailyTracsection;
	@NotBlank
	@NotEmpty
	private Integer weeklytransection;
	@NotBlank
	@NotEmpty
	private Integer balance;
	@NotBlank
	@NotEmpty
//	private Date date;
	
	
	public paytmDto() {
		super();
		
	}


	public paytmDto(int id, String name, String gmail, int logInPassward, int transectionPin, int dailyTracsection,
			int weeklytransection, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
		this.logInPassward = logInPassward;
		this.transectionPin = transectionPin;
		this.dailyTracsection = dailyTracsection;
		this.weeklytransection = weeklytransection;
		this.balance = balance;
		
	}


	@Override
	public String toString() {
		return "paytmDto [id=" + id + ", name=" + name + ", gmail=" + gmail + ", logInPassward=" + logInPassward
				+ ", transectionPin=" + transectionPin + ", dailyTracsection=" + dailyTracsection
				+ ", weeklytransection=" + weeklytransection + ", balance=" + balance + "]";
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


	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	public int getLogInPassward() {
		return logInPassward;
	}


	public void setLogInPassward(int logInPassward) {
		this.logInPassward = logInPassward;
	}


	public int getTransectionPin() {
		return transectionPin;
	}


	public void setTransectionPin(int transectionPin) {
		this.transectionPin = transectionPin;
	}


	public int getDailyTracsection() {
		return dailyTracsection;
	}


	public void setDailyTracsection(int dailyTracsection) {
		this.dailyTracsection = dailyTracsection;
	}


	public int getWeeklytransection() {
		return weeklytransection;
	}


	public void setWeeklytransection(int weeklytransection) {
		this.weeklytransection = weeklytransection;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	
	
	

}
