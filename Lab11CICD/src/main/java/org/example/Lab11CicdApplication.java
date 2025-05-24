package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class Lab11CicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab11CicdApplication.class, args);
    }

    @Scheduled(fixedRate = 5000)
    public void sayHello() {
        System.out.println("hello world");
    }

}
