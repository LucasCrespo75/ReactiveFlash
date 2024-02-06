package br.com.dio.reactiveflashCard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@SpringBootApplication
@EnableReactiveMongoAuditing(dateTimeProviderRef = "dateTimeProvider")
public class ReactiveFlashCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveFlashCardApplication.class, args);
	}

}
