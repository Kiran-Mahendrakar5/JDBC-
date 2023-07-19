package com.xworkz.campany.dto;

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
@Table(name ="campany")

public class CampanyDto {
	@Id
	private int id;
	private String campanyName;
	private String email;
	private String location;
	private int employer;
	
	

}
