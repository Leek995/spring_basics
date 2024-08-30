package org.malik.spring_basics;

import org.malik.spring_basics.controller.Role;
import org.malik.spring_basics.controller.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringBasicsApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBasicsApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringBasicsApplication.class, args);
        log.info("Application started successfully!");
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            log.info("Running command line runner");
            User user = new User(1, "malik", "willis", "willis.malik.r@gmail.com", "password", Role.ROLE_ADMIN);
            log.info(user.toString());
        };
    }

}
