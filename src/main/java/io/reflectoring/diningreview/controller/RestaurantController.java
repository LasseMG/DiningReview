package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.model.Restaurant;
import io.reflectoring.diningreview.repository.RestaurantRepository;
import io.reflectoring.diningreview.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.findAllRestaurantsOrderByName();
    }

    @GetMapping
    public List<Restaurant> getAllRestaurantsByZipcode(String zipcode) {
        return restaurantService.findRestaurantsByZipcode(zipcode);
    }

    //TODO ResponseEntity for alle metoder, PUT, POST
}
