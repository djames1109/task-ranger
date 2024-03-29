package org.castle.djames.taskranger.commandservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.castle.djames.taskranger.commandservice")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
