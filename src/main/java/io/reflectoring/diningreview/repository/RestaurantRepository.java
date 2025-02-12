package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    Restaurant findById(long id);
    List<Restaurant> findAllByZipcode(String zipcode);
}
