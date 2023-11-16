package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.DefaultKafkaHeaderMapper;
import org.springframework.kafka.support.KafkaHeaderMapper;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    Sender sender;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sender.doSomething();
    }
}
