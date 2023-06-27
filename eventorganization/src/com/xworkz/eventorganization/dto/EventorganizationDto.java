package com.xworkz.eventorganization.dto;

public class EventorganizationDto {
	
	private int id;
	private String founder;
	private String CEO;
	private String location;
	private String gmail;
	private String ModeOfPayment;
	private int employee;
	private String events;
	private int rating;
	private int participantsPerDayCost;
	private int participantsWeekCost;
	private int Phonenumber;
	private int establishment;
	private int openTime;
	private int closeTime;
	
	public EventorganizationDto() {
		super();

	}

	public EventorganizationDto(int id, String founder, String cEO, String location, String gmail, String modeOfPayment,
			int employee, String events, int rating, int participantsPerDayCost, int participantsWeekCost,
			int phonenumber, int establishment, int openTime, int closeTime) {
		super();
		this.id = id;
		this.founder = founder;
		CEO = cEO;
		this.location = location;
		this.gmail = gmail;
		ModeOfPayment = modeOfPayment;
		this.employee = employee;
		this.events = events;
		this.rating = rating;
		this.participantsPerDayCost = participantsPerDayCost;
		this.participantsWeekCost = participantsWeekCost;
		Phonenumber = phonenumber;
		this.establishment = establishment;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	@Override
	public String toString() {
		return "EventorganizationDto [id=" + id + ", Event=" + founder + ", CEO=" + CEO + ", location=" + location
				+ ", gmail=" + gmail + ", ModeOfPayment=" + ModeOfPayment + ", employee=" + employee + ", events="
				+ events + ", rating=" + rating + ", participantsPerDayCost=" + participantsPerDayCost
				+ ", participantsWeekCost=" + participantsWeekCost + ", Phonenumber=" + Phonenumber + ", establishment="
				+ establishment + ", openTime=" + openTime + ", closeTime=" + closeTime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getCEO() {
		return CEO;
	}

	public void setCEO(String cEO) {
		CEO = cEO;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getModeOfPayment() {
		return ModeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		ModeOfPayment = modeOfPayment;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	public String getEvents() {
		return events;
	}

	public void setEvents(String events) {
		this.events = events;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getParticipantsPerDayCost() {
		return participantsPerDayCost;
	}

	public void setParticipantsPerDayCost(int participantsPerDayCost) {
		this.participantsPerDayCost = participantsPerDayCost;
	}

	public int getParticipantsWeekCost() {
		return participantsWeekCost;
	}

	public void setParticipantsWeekCost(int participantsWeekCost) {
		this.participantsWeekCost = participantsWeekCost;
	}

	public int getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		Phonenumber = phonenumber;
	}

	public int getEstablishment() {
		return establishment;
	}

	public void setEstablishment(int establishment) {
		this.establishment = establishment;
	}

	public int getOpenTime() {
		return openTime;
	}

	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}

	public int getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}
	
	
	
	
	

	
	

}
