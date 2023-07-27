package com.xworkz.vehicle.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehicle_table")
@NamedQuery(name = "readAll", query = "select dto from VehicleDto dto")
@NamedQuery(name = "findByname", query = "select dto from VehicleDto dto where dto.name=:nm")

@NamedQuery(name = "findBycm", query = "select dto from VehicleDto dto  where dto.type=:ty and dto.consume=:cm")

@NamedQuery(name = "updattynam", query = "update VehicleDto dto set dto.type=:tpe where dto.name=:nm ")
@NamedQuery(name = "updateloudAndpwrById", query = "update VehicleDto dto set dto.lounched =:ln ,dto.power =:pw where dto.id=:ids")
@NamedQuery(name = "deleteBylounched", query = "delete from VehicleDto dto where dto.lounched=:ln ")

public class VehicleDto {
	@Id
	private int id;
	private String name;
	private String type;
	private String consume;
	private String power;
	private String lounched;

}
