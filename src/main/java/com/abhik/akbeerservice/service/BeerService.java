package com.abhik.akbeerservice.service;

import java.util.UUID;

import com.abhik.akbeerservice.web.model.BeerDto;

public interface BeerService {

	BeerDto getById(UUID beerId);

	BeerDto saveNewBeer(BeerDto beerDto);

	BeerDto updateBeer(UUID beerId, BeerDto beerDto);

}
