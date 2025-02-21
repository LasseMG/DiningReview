package io.reflectoring.diningreview.repository;

import io.reflectoring.diningreview.model.DiningReview;
import io.reflectoring.diningreview.model.ReviewStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {
    List<DiningReview> findAllByReviewStatus(ReviewStatus reviewStatus);
}
