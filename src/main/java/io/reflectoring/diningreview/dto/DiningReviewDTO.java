package io.reflectoring.diningreview.dto;

import io.reflectoring.diningreview.model.DiningReview;

public class DiningReviewDTO {
    private String submittedBy;
    private String optionalReviewComment;
    private Integer peanutAllergyScore;
    private Integer eggAllergyScore;
    private Integer dairyAllergyScore;

    public DiningReviewDTO(String submittedBy, String optionalReviewComment, Integer peanutAllergyScore, Integer eggAllergyScore, Integer dairyAllergyScore) {
        this.submittedBy = submittedBy;
        this.optionalReviewComment = optionalReviewComment;
        this.peanutAllergyScore = peanutAllergyScore;
        this.eggAllergyScore = eggAllergyScore;
        this.dairyAllergyScore = dairyAllergyScore;
    }

    public DiningReviewDTO(DiningReview diningReview) {
        this.submittedBy = diningReview.getSubmittedBy();
        this.optionalReviewComment = diningReview.getOptionalReviewComment();
        this.peanutAllergyScore = diningReview.getPeanutAllergyScore();
        this.eggAllergyScore = diningReview.getEggAllergyScore();
        this.dairyAllergyScore = diningReview.getDairyAllergyScore();
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
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
}
