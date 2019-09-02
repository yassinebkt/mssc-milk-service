package com.bkt.msscmilkservice.repositories;

import com.bkt.msscmilkservice.domain.Milk;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface MilkRepository extends PagingAndSortingRepository<Milk, UUID> {
}
