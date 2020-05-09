package com.abhik.akbeerservice.repositories;

import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.abhik.akbeerservice.domain.Beer;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
