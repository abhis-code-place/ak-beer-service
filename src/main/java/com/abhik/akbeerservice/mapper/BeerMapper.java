package com.abhik.akbeerservice.mapper;

import org.mapstruct.Mapper;

import com.abhik.akbeerservice.domain.Beer;
import com.abhik.akbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}