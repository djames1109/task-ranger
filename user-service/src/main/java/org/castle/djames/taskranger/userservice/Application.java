package org.castle.djames.taskranger.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.castle.djames.taskranger.userservice")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
