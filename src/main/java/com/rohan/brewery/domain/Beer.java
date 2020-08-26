package com.rohan.brewery.domain;

import java.sql.Timestamp;
import java.util.UUID;

import com.rohan.brewery.web.model.v2.BeerStyleEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
	UUID id;
	String beerName;
	BeerStyleEnum beerStyle;
	Long upc;
	
	private Timestamp createdDate;
	private Timestamp lastUpdatedDate;
}
