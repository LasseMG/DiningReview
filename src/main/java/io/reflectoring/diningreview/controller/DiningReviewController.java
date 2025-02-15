package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.service.DiningReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diningreviews")
public class DiningReviewController {
    private final DiningReviewService diningReviewService;

    @Autowired
    public DiningReviewController(DiningReviewService reviewService) {
        this.diningReviewService = reviewService;
    }

    @PostMapping
    public DiningReview submitReview(@RequestBody DiningReview review) {
        diningReviewService.submitReview(review);
        return review;
    }

    @PutMapping("/approve")
    public DiningReview approveReview(@RequestBody DiningReview review) {
        diningReviewService.approveReview(review);
        return review;
    }

    @PutMapping("/reject")
    public DiningReview rejectReview(@RequestBody DiningReview review) {
        diningReviewService.rejectReview(review);
        return review;
    }

    @GetMapping
    public List<DiningReview> getPendingReviews() {
        return diningReviewService.getPendingReviews();
    }

    @DeleteMapping
    public DiningReview deleteReview(@RequestBody DiningReview review) {
        diningReviewService.deleteReview(review);
        return review;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiningReview> getReviewById(@PathVariable Long id) {
        DiningReview diningReview = diningReviewService.getReviewById(id);
        return ResponseEntity.ok(diningReview);
    }

    //TODO ResponseEntity for alle metoder
}
