package io.reflectoring.diningreview.service;

import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.repository.DiningReviewRepository;
import io.reflectoring.diningreview.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiningReviewService {

    private DiningReviewRepository diningReviewRepository;

    @Autowired
    public DiningReviewService(DiningReviewRepository diningReviewRepository) {
        this.diningReviewRepository = diningReviewRepository;
    }


    public DiningReview submitReview(DiningReview review) {
        return diningReviewRepository.save(review);
    }

    public Iterable<DiningReview> getReviews() {
        return diningReviewRepository.findAll();
    }

    public List<DiningReview> approveReview(DiningReview review) {

    }

    public List<DiningReview> getReviewsByRestaurant(Restaurant restaurant) {
        return diningReviewRepository.findALlReviewsByRestaurant(restaurant);
    }
}
