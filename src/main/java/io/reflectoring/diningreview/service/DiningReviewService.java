package io.reflectoring.diningreview.service;

import io.reflectoring.diningreview.exceptions.EntityNotFoundException;
import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.model.Restaurant;
import io.reflectoring.diningreview.model.ReviewStatus;
import io.reflectoring.diningreview.repository.DiningReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void approveReview(DiningReview review) {
        DiningReview reviewToApprove = diningReviewRepository.findById(review.getId()).orElseThrow(() -> new EntityNotFoundException("Review not found"));
        reviewToApprove.setReviewStatus(ReviewStatus.ACCEPTED);
        diningReviewRepository.save(reviewToApprove);
    }

    public void rejectReview(DiningReview review) {
        DiningReview reviewToReject = diningReviewRepository.findById(review.getId()).orElseThrow(() -> new EntityNotFoundException("Review not found"));
        reviewToReject.setReviewStatus(ReviewStatus.REJECTED);
        diningReviewRepository.save(reviewToReject);
    }

    public List<DiningReview> getReviewsByRestaurant(Restaurant restaurant) {
        List<DiningReview> reviews = diningReviewRepository.findAllByRestaurant(restaurant);
        if (reviews.isEmpty()) {
            throw new EntityNotFoundException("No reviews found for restaurant " + restaurant);
        }
        return reviews;
    }

    public List<DiningReview> getPendingReviews() {
        return diningReviewRepository.findAllByReviewStatus(ReviewStatus.PENDING);
    }

    public void deleteReviewById(Long id) {
        Optional<DiningReview> reviewToDelete = diningReviewRepository.findById(id);
        if (reviewToDelete.isPresent()) {
            diningReviewRepository.delete(reviewToDelete.get());
        } else {
            throw new EntityNotFoundException("Review not found");
        }
    }

    public DiningReview getReviewById(Long id) {
        return diningReviewRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Review not found"));
    }
}
