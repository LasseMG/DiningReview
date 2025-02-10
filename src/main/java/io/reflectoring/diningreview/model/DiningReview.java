package io.reflectoring.diningreview.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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

    public DiningReview() {
    }
    public DiningReview(User user, Restaurant restaurant, String optionalReviewComment, Integer peanutAllergyScore, Integer eggAllergyScore, Integer dairyAllergyScore) {
        this.submittedBy = user.getName();
        this.restaurantReviewedId = restaurant.getId();
        this.optionalReviewComment = optionalReviewComment;
        this.peanutAllergyScore = peanutAllergyScore;
        this.eggAllergyScore = eggAllergyScore;
        this.dairyAllergyScore = dairyAllergyScore;
    }
}
