package com.rohan.brewery.services.implementations;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rohan.brewery.services.BeerService;
import com.rohan.brewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder()
				.id(beerId)
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}

	@Override
	public BeerDto save(BeerDto beerDto) {
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		
	}

	@Override
	public void deleteById(UUID beerId) {
		log.debug("Beer deleted succesfully");	
	}
	
	
}
