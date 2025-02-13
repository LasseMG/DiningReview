package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {
    List<DiningReview> findALlReviewsByRestaurant(Restaurant restaurant);
}
