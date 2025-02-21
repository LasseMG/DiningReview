package io.reflectoring.diningreview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "io.reflectoring.diningreview.model")
@EnableJpaRepositories("io.reflectoring.diningreview.repository")
@SpringBootApplication(scanBasePackages = "io.reflectoring.diningreview") //bean scanning config
public class DiningReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiningReviewApplication.class, args);
	}

}
