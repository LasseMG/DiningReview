package io.reflectoring.diningreview.service;

import io.reflectoring.diningreview.exceptions.EntityNotFoundException;
import io.reflectoring.diningreview.model.Restaurant;
import io.reflectoring.diningreview.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> findRestaurantsByZipcode(String zipcode) {
        List<Restaurant> restaurants = restaurantRepository.findAllByZipcodeOrderByName(zipcode);
        if (restaurants.isEmpty()) {
            throw new EntityNotFoundException("No restaurant found with zipcode " + zipcode);
        }
        return restaurants;
    }

    public Restaurant findRestaurantById(Long id) {
        return restaurantRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Restaurant not found with id " + id));
    }

    public List<Restaurant> findAllRestaurantsOrderByName() {
        return restaurantRepository.findAllByOrderByName();
    }

    public void updateRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    public void deleteRestaurantById(Long id) {
        Optional<Restaurant> restaurantToDelete = restaurantRepository.findById(id);
        if (restaurantToDelete.isEmpty()) {
            throw new EntityNotFoundException("Restaurant not found with id " + id);
        }
        restaurantRepository.deleteById(id);
    }
}
