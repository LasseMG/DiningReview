package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.service.RestaurantService;
import io.reflectoring.diningreview.model.Restaurant;
import io.reflectoring.diningreview.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService, RestaurantRepository restaurantRepository) {
        this.restaurantService = restaurantService;
    }

    @PostMapping
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.createRestaurant(restaurant);
    }

    @GetMapping("/{id}")
    public Optional<Restaurant> getRestaurantDetailsByID(@PathVariable Long id) {
        return restaurantService.findRestaurantById(id);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurantsByZipcode(String zipcode) {
        return restaurantService.findRestaurantsByZipcode(zipcode);
    }
}
