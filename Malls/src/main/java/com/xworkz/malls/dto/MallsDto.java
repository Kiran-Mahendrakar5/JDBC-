package com.xworkz.malls.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Mall_table")
@NamedQuery(name ="ReadAll",query = "Select dto from MallsDto dto ")
@NamedQuery(name ="findById",query = "Select dto from MallsDto dto where dto.id=:ids ")//tablename changed to mallDto
@NamedQuery(name = "findByName",query = "Select dto from MallsDto dto where dto.name=:name")
@NamedQuery(name ="updatenameById" ,query ="update MallsDto dto set dto.name=:nm where dto.id=:id")
@NamedQuery(name ="deleteById",query ="delete from MallsDto dto where dto.id=:idr ")





public class MallsDto {
	
	@Id
	private int id;
	@NotBlank
	@NotNull
	private String  name;
	@NotBlank
	@NotNull
	private String  floor;
	@NotBlank
	@NotNull
	private String  location;
	@NotBlank
	@NotNull
	private String  phoneNumber;
	

}
