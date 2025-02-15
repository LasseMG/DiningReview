package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.model.Restaurant;
import io.reflectoring.diningreview.model.ReviewStatus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {
    List<DiningReview> findAllByRestaurant(Restaurant restaurant);
    List<DiningReview> findAllByReviewStatus(ReviewStatus reviewStatus);

}
