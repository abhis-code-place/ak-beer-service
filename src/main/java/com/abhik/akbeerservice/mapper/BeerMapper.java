package com.abhik.akbeerservice.mapper;

import org.mapstruct.Mapper;

import com.abhik.akbeerservice.domain.Beer;
import com.abhik.akbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}