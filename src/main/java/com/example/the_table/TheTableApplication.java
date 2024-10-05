package com.example.the_table;

import com.example.the_table.Deck.SpanishDeck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.config.annotation.EnableWebSocket;


@RestController
@SpringBootApplication
public class TheTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheTableApplication.class, args);

        
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello, Spring Boot.";
    }
}
