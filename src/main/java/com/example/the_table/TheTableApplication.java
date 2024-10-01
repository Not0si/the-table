package com.example.the_table;

import com.example.the_table.Deck.Deck;
import com.example.the_table.Deck.SpanishDeck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheTableApplication.class, args);

        SpanishDeck deck = new SpanishDeck();

        System.out.println(deck.toString());

        deck.pickRandom(4);

        System.out.println(deck.toString());
    }

}
