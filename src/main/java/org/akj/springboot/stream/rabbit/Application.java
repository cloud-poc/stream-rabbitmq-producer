package org.akj.springboot.stream.rabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Source.class)
public class Application{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
