package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.service.DiningReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public ResponseEntity<DiningReview> submitReview(@RequestBody DiningReview review) {
        DiningReview createdReview = diningReviewService.submitReview(review);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReview);
    }

    @PutMapping("/approve")
    public ResponseEntity<DiningReview> approveReview(@RequestBody DiningReview review) {
        DiningReview reviewToApprove = diningReviewService.approveReview(review);
        return ResponseEntity.status(HttpStatus.OK).body(reviewToApprove);
    }

    @PutMapping("/reject")
    public DiningReview rejectReview(@RequestBody DiningReview review) {
        diningReviewService.rejectReview(review);
        return review;
    }

    @GetMapping
    public ResponseEntity<List<DiningReview>> getPendingReviews() {
        List<DiningReview> pendingReviews = diningReviewService.getPendingReviews();
        return ResponseEntity.ok(pendingReviews);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DiningReview> deleteReview(@PathVariable Long id) {
        DiningReview reviewToDelete = diningReviewService.deleteReviewById(id);
        return ResponseEntity.ok(reviewToDelete);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiningReview> getReviewById(@PathVariable Long id) {
        DiningReview diningReview = diningReviewService.getReviewById(id);
        return ResponseEntity.ok(diningReview);
    }

    //TODO ResponseEntity for alle metoder
}
