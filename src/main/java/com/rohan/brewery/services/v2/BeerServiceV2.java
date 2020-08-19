package com.rohan.brewery.services.v2;

import java.util.UUID;

import com.rohan.brewery.web.model.v2.BeerDtoV2;

public interface BeerServiceV2 {

	BeerDtoV2 getBeerById(UUID beerId);
	BeerDtoV2 save(BeerDtoV2 beerDtoV2);
	void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2);
	void deleteById(UUID beerId);
}
