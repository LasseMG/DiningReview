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

    @PutMapping("/approve/{id}")
    public ResponseEntity<DiningReview> approveReview(@PathVariable Long id) {
        DiningReview reviewToApprove = diningReviewService.getReviewById(id);
        diningReviewService.approveReview(reviewToApprove);
        return ResponseEntity.status(HttpStatus.OK).body(reviewToApprove);
    }

    @PutMapping("/reject/{id}")
    public ResponseEntity<DiningReview> rejectReview(@PathVariable Long id) {
        DiningReview reviewToReject = diningReviewService.getReviewById(id);
        diningReviewService.rejectReview(reviewToReject);
        return ResponseEntity.status(HttpStatus.OK).body(reviewToReject);
    }

    @GetMapping
    public ResponseEntity<List<DiningReview>> getPendingReviews() {
        List<DiningReview> pendingReviews = diningReviewService.getPendingReviews();
        return ResponseEntity.ok(pendingReviews);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
        diningReviewService.deleteReviewById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiningReview> getReviewById(@PathVariable Long id) {
        DiningReview diningReview = diningReviewService.getReviewById(id);
        return ResponseEntity.ok(diningReview);
    }
}
