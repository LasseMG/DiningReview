package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> findAllByZipcodeOrderByName(String zipcode);
    List<Restaurant> findAllByOrderByName();
}
