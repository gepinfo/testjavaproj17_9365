package com.defaultServices.securitymanager;

import com.defaultServices.securitymanager.service.SigninService;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SecuritymanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritymanagerApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(SigninService signinService) {
		return args -> {
			Logger logger = Logger.getLogger(SecuritymanagerApplication.class.getName());
			String filePath="/home/decoders/Videos/securitymanager/src/main/resources/roles.json";
			signinService.saveRolesFromJson(filePath);
		};
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("*")
				.allowedOrigins("*")
				.allowedHeaders("*");
			}
		};
	}
}
