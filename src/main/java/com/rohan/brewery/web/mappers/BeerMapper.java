package com.rohan.brewery.web.mappers;

import org.mapstruct.Mapper;

import com.rohan.brewery.domain.Beer;
import com.rohan.brewery.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
	BeerDto beerToBeerDto(Beer beer);
	Beer beerDtotoBeer(BeerDto beerDto);
}
