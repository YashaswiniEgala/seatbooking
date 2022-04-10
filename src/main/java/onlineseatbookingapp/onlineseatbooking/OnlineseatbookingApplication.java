package onlineseatbookingapp.onlineseatbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

@SpringBootApplication(scanBasePackages = {"com.controller","com.model"})
@EnableJpaRepositories({"com.model"})
@EntityScan("com.model")
public class OnlineseatbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineseatbookingApplication.class, args);
	}

}