package com.xworkz.rummy.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="rummy")

public class RummyDto {
	
	@Id
	private int id;
	private String name;
	private String gmail;
	private int players;
	private int noOfJockers;
	private int invested;
	private int profite;
	private int loss;
	
	
	
	
	
	
	
	

}
