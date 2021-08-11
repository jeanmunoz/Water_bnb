package com.jean.waterbnb.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jean.waterbnb.models.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
