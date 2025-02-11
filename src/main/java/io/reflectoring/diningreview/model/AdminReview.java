package io.reflectoring.diningreview.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AdminReview {
    @Id
    @GeneratedValue
    private Long id;
    private boolean reviewAccepted;

    public AdminReview() {
    }

    public AdminReview(boolean reviewAccepted) {
        this.reviewAccepted = reviewAccepted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isReviewAccepted() {
        return reviewAccepted;
    }

    public void setReviewAccepted(boolean reviewAccepted) {
        this.reviewAccepted = reviewAccepted;
    }
}


