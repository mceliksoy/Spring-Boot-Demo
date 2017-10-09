package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeviceControlServiceApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeviceControlServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.debug("The device control service is running .................");
        SpringApplication.run(DeviceControlServiceApplication.class, args);
    }
}
