package com.springCoreConcepts.SpringCoreConcepts;

import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringCoreConceptsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

	private final UserService userService;

	public SpringCoreConceptsApplication(DataBase dataBase, Configurations configurations) {
		this.userService = new UserService(dataBase, configurations);
	}

	@Override
	public void run(String @NonNull ... args) throws Exception {
		userService.saveUser("Sayan Pal");
	}
}
