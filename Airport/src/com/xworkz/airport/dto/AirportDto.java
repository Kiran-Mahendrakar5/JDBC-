package com.xworkz.airport.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "airport")

public class AirportDto {
	@Id
	private int id;
	private String AirportName;
	private String location;
	private String rating;
	private String phoneNumber;

}
