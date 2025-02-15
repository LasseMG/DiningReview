package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.service.DiningReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diningreviews")
public class DiningReviewController {
    private final DiningReviewService diningReviewService;

    @Autowired
    public DiningReviewController(DiningReviewService reviewService) {
        this.diningReviewService = reviewService;
    }

    @GetMapping
    public Iterable<DiningReview> getPendingReviews() {
        return null;
        //Iterable<DiningReview> reviewService.getReviews();
    }
}
