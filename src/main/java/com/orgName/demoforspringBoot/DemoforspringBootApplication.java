package com.orgName.demoforspringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoforspringBootApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DemoforspringBootApplication.class, args);
    }

    public DemoforspringBootApplication(UserService userService) {
        this.userService = userService;
    }

    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.saveUser("Priyanka");

    }
}
