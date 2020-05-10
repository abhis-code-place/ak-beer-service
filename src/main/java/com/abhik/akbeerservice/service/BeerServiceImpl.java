package com.abhik.akbeerservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhik.akbeerservice.domain.Beer;
import com.abhik.akbeerservice.mapper.BeerMapper;
import com.abhik.akbeerservice.repositories.BeerRepository;
import com.abhik.akbeerservice.web.controller.NotFoundException;
import com.abhik.akbeerservice.web.model.BeerDto;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {
	
	private final BeerRepository beerRepository;
	private final BeerMapper beerMapper;

	@Override
	public BeerDto getById(UUID beerId) {
		
		return beerMapper.beerToBeerDto(
				beerRepository.findById(beerId).orElseThrow(NotFoundException::new)
			);
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {	
		return beerMapper.beerToBeerDto(
				beerRepository.save(beerMapper.beerDtoToBeer(beerDto))
			);
	}

	@Override
	public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
		
		Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());

        return beerMapper.beerToBeerDto(beerRepository.save(beer));
	}

}
