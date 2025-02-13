package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.repository.DiningReviewRepository;
import io.reflectoring.diningreview.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diningreviews")
public class DiningReviewController {
    private final ReviewService reviewService;

    @Autowired
    public DiningReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public Iterable<DiningReview> getPendingReviews() {
        return null;
        //Iterable<DiningReview> reviewService.getReviews();
    }


}
