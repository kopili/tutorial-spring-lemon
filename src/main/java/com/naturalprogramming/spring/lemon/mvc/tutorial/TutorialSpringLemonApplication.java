package com.naturalprogramming.spring.lemon.mvc.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.naturalprogrammer.spring.lemon.LemonConfig;

@SpringBootApplication(scanBasePackageClasses = { TutorialSpringLemonApplication.class, LemonConfig.class })
public class TutorialSpringLemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialSpringLemonApplication.class, args);
	}
}
