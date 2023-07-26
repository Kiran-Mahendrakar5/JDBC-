package com.xworkz.railwayss.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Railwayss_table")
@Entity
public class RailwayssDto {
	@Id
	private int id;
	private String RailwayssName;
	private String location;
	private String rating;
	private String phoneNumber;

}
