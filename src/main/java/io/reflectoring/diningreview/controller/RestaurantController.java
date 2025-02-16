package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.model.Restaurant;
import io.reflectoring.diningreview.repository.RestaurantRepository;
import io.reflectoring.diningreview.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService, RestaurantRepository restaurantRepository) {
        this.restaurantService = restaurantService;
    }

    @PostMapping
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant createdRestaurant = restaurantService.createRestaurant(restaurant);
        return new ResponseEntity<Restaurant>(createdRestaurant, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> findRestaurantById(@PathVariable Long id) {
        Restaurant restaurant = restaurantService.findRestaurantById(id);
        return ResponseEntity.ok(restaurant);
    }

    @GetMapping
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
        List<Restaurant> restaurants = restaurantService.findAllRestaurantsOrderByName();
        return ResponseEntity.ok(restaurants);
    }

    @GetMapping
    public ResponseEntity<List<Restaurant>> getAllRestaurantsByZipcode(String zipcode) {
        List<Restaurant> restaurants = restaurantService.findRestaurantsByZipcode(zipcode);
        return ResponseEntity.ok(restaurants);
    }

    @PutMapping
    public ResponseEntity<Restaurant> updateRestaurant(@RequestBody Restaurant restaurant) {
        restaurantService.updateRestaurant(restaurant);
        return ResponseEntity.ok(restaurant);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRestaurantById(@PathVariable Long id) {
        restaurantService.deleteRestaurantById(id);
        return ResponseEntity.noContent().build();
    }
}
