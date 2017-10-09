package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuiServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(GuiServiceApplication.class);
	public static void main(String[] args) {
		LOGGER.debug("The Gui service is running........");
		SpringApplication.run(GuiServiceApplication.class, args);
	}
}
