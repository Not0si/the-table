package com.example.the_table.Deck;

import com.example.the_table.Card.Card;
import com.example.the_table.Card.CardSuit;
import com.example.the_table.Card.CardType;

import java.util.ArrayList;

public class SpanishDeck extends Deck {

    private static ArrayList<ArrayList<Card>> getSpanishDeck() {
        CardSuit[] suits = CardSuit.values();
        CardType[] types = CardType.values();
        ArrayList<Card> initCards = new ArrayList<>(41);

        ArrayList<ArrayList<Card>> result = new ArrayList<>(2);

        for (CardSuit suit : suits) {
            for (CardType type : types) {
                initCards.add(new Card(suit, type));
            }
        }

        result.add(Deck.shuffleDeck(initCards));
        result.add(new ArrayList<>());

        return result;
    }


    public SpanishDeck() {
        super(getSpanishDeck());
    }


}
