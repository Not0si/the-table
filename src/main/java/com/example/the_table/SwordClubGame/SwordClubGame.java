package com.example.the_table.SwordClubGame;

import com.example.the_table.Card.SpanishCard;
import com.example.the_table.Deck.SpanishDeck;
import com.example.the_table.Turn.Turn;

import java.util.ArrayList;

public class SwordClubGame {
    private String id;
    private ArrayList<SwordClubPlayer> players;
    private Integer numberOfPlayers;
    private Turn turn;
    private SpanishCard playedCard;
    private SpanishDeck deck;
    

    public SwordClubGame(int numberOfPlayers) {
        ArrayList<SwordClubPlayer> In = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            In.add(new SwordClubPlayer());
        }

        this.id = "Hello";
        this.players = In;
    }
}
