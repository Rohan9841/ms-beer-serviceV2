package com.rohan.brewery.services;

import java.util.UUID;

import com.rohan.brewery.web.model.BeerDto;

public interface BeerService {
	BeerDto getBeerById(UUID beerId);
	BeerDto save(BeerDto beerDto);
	void updateBeer(UUID beerId, BeerDto beerDto);
	void deleteById(UUID beerId);
}

