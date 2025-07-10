package com.Restraunt.FoodMenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class FoodMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodMenuApplication.class, args);

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "admin@12";  // try other guesses too
		String hashed = "$2a$10$Z/113laoeWUI59NLWeBgnuNOpikZPF1LZ8COEAAL4lRx0yQnxCb.6";

		boolean matches = encoder.matches(rawPassword, hashed);
		System.out.println("Password matches? " + matches);

	}


}
