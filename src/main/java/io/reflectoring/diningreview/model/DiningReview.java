package io.reflectoring.diningreview.model;

import jakarta.persistence.*;

@Entity
public class DiningReview {
    @Id
    @GeneratedValue
    private Long id;
    private String submittedBy;
    private Long restaurantReviewedId;
    private String optionalReviewComment;
    private Integer peanutAllergyScore;
    private Integer eggAllergyScore;
    private Integer dairyAllergyScore;
    @Enumerated(EnumType.STRING)
    private ReviewStatus reviewStatus = ReviewStatus.PENDING;
    private Long userId;

    public DiningReview(String submittedBy, Long restaurantReviewedId, String optionalReviewComment, Integer peanutAllergyScore, Integer eggAllergyScore, Integer dairyAllergyScore, ReviewStatus reviewStatus, Long userId) {
        this.submittedBy = submittedBy;
        this.restaurantReviewedId = restaurantReviewedId;
        this.optionalReviewComment = optionalReviewComment;
        this.peanutAllergyScore = peanutAllergyScore;
        this.eggAllergyScore = eggAllergyScore;
        this.dairyAllergyScore = dairyAllergyScore;
        this.reviewStatus = reviewStatus;
        this.userId = userId;
    }

    public DiningReview() {
    }

    public DiningReview(EndUser user, Restaurant restaurant, String optionalReviewComment, Integer peanutAllergyScore, Integer eggAllergyScore, Integer dairyAllergyScore, Long userId) {
        this.submittedBy = user.getUsername();
        this.restaurantReviewedId = restaurant.getId();
        this.optionalReviewComment = optionalReviewComment;
        this.peanutAllergyScore = peanutAllergyScore;
        this.eggAllergyScore = eggAllergyScore;
        this.dairyAllergyScore = dairyAllergyScore;
        this.reviewStatus = ReviewStatus.PENDING;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public Long getRestaurantReviewedId() {
        return restaurantReviewedId;
    }

    public void setRestaurantReviewedId(Long restaurantReviewedId) {
        this.restaurantReviewedId = restaurantReviewedId;
    }

    public String getOptionalReviewComment() {
        return optionalReviewComment;
    }

    public void setOptionalReviewComment(String optionalReviewComment) {
        this.optionalReviewComment = optionalReviewComment;
    }

    public Integer getPeanutAllergyScore() {
        return peanutAllergyScore;
    }

    public void setPeanutAllergyScore(Integer peanutAllergyScore) {
        this.peanutAllergyScore = peanutAllergyScore;
    }

    public Integer getEggAllergyScore() {
        return eggAllergyScore;
    }

    public void setEggAllergyScore(Integer eggAllergyScore) {
        this.eggAllergyScore = eggAllergyScore;
    }

    public Integer getDairyAllergyScore() {
        return dairyAllergyScore;
    }

    public void setDairyAllergyScore(Integer dairyAllergyScore) {
        this.dairyAllergyScore = dairyAllergyScore;
    }

    public ReviewStatus getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(ReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
    }
}

