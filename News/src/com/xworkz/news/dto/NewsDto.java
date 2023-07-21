package com.xworkz.news.dto;

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
@Table(name = "news")

public class NewsDto {
    @Id
	private int id;
	private String channelName;
	private String newType;
	private String language;
	private String date;

}
