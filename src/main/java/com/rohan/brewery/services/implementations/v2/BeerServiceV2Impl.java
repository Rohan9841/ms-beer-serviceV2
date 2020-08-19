package com.rohan.brewery.services.implementations.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rohan.brewery.services.v2.BeerServiceV2;
import com.rohan.brewery.web.model.v2.BeerDtoV2;
import com.rohan.brewery.web.model.v2.BeerStyleEnum;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {@Override
	public BeerDtoV2 getBeerById(UUID beerId) {
	return BeerDtoV2.builder()
			.id(beerId)
			.beerName("Galaxy Cat")
			.beerStyle(BeerStyleEnum.ALE)
			.build();
	}

	@Override
	public BeerDtoV2 save(BeerDtoV2 beerDtoV2) {
		return BeerDtoV2.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {
		
	}

	@Override
	public void deleteById(UUID beerId) {
		log.debug("Beer deleted succesfully");		
	}
	
}
