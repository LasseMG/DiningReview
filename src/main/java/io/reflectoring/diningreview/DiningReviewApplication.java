package io.reflectoring.diningreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "io.reflectoring.diningreview.model")
@SpringBootApplication
public class DiningReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiningReviewApplication.class, args);
	}

}
