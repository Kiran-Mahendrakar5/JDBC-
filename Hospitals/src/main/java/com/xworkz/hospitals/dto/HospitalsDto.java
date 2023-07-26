package com.xworkz.hospitals.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Hospitals_table")
public class HospitalsDto {
	
	@Id
	private int id;
	@NotBlank
	@NotNull
	private String HospitalName;
	@NotBlank
	@NotNull
	private String doctorsName;
	@NotBlank
	@NotNull
	private String nerseName;
	
	

}
