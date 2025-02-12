package io.reflectoring.diningreview.Service;

import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.repository.DiningReviewRepository;
import io.reflectoring.diningreview.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private DiningReviewRepository diningReviewRepository;

    @Autowired
    public ReviewService(DiningReviewRepository diningReviewRepository) {
        this.diningReviewRepository = diningReviewRepository;
    }


    public DiningReview submitReview(DiningReview review) {
        return diningReviewRepository.save(review);
    }

    public List<DiningReview> getReviews() {
        return null;
    }

    public void approveReview(DiningReview review) {

    }

    public List<DiningReview> getReviewsByRestaurant(Restaurant restaurant) {
        return null;
    }
}
