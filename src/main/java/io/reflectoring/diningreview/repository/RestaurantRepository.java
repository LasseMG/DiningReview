package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> findAllByZipcodeOrderByName(String zipcode);
    List<Restaurant> findAllByOrderByName();
}
