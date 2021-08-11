package com.jean.waterbnb.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jean.waterbnb.models.Pool;

public interface PoolRepository extends CrudRepository<Pool, Long>{
	List<Pool> findAll();
}
