package servicetest;

import io.reflectoring.diningreview.model.*;
import io.reflectoring.diningreview.repository.DiningReviewRepository;
import io.reflectoring.diningreview.service.DiningReviewService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)//Spring TestContext Framework, aka. brug springs testing support til JUnit
public class DiningReviewServiceTest {

    @Autowired
    private DiningReviewService diningReviewService;

    @Autowired
    private DiningReviewRepository diningReviewRepository;

    private EndUser testUser;
    private Restaurant testRestaurant;
    private DiningReview testDiningReview;

    @BeforeEach
    public void setup() {
        //this.diningReviewService = new DiningReviewService(diningReviewRepository); //Manuel initialization

        //Arrange
        testUser = new EndUser("Jonas", "Denver", "Colorado", "123456", true, false, false);
        testRestaurant = new Restaurant("Den Gyldne Kro", "Privatvej 1", "123456", "Colorado", "USA", "12345678", PriceRange.MODERATE, 70, 0, "Dansk", 0, 0, 0, 0);
        testDiningReview = new DiningReview(testUser.getName(), testRestaurant.getId(), "God, lækker mad til gode priser. Mange muligheder for æg- og nøddeintolerante, men knap så mange til laktoseintolerante.", 5, 5, 2, ReviewStatus.PENDING);
    }


    @Test
    public void testSubmitDiningReview() {
        //Act
        DiningReview reviewToSave = diningReviewService.submitReview(testDiningReview);

        //Assert: check om den får et id automatisk
        assertNotNull(reviewToSave.getId(), "ID ikke null");
    }

    @Test
    public void testApproveReview() {
        fail();
    }

    @Test
    public void testRejectReview() {
        fail();
    }

    @Test
    public void testDeleteDiningReviewById() {
        fail();
    }

    @Test
    public void testGetReviewsByRestaurant() {
        fail();
    }

    @Test
    public void testGetPendingReviews() {
        fail();
    }

    @Test
    public void testGetReviewById() {
        fail();
    }
}
