package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.repository.DiningReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diningreviews")
public class DiningReviewController {

    private final DiningReviewRepository diningReviewRepository;

    @Autowired
    public DiningReviewController(DiningReviewRepository diningReviewRepository) {
        this.diningReviewRepository = diningReviewRepository;
    }


}
