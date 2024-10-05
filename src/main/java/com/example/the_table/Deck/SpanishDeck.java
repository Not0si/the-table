package com.example.the_table.Deck;


import com.example.the_table.Card.SpanishCard;

import java.util.ArrayList;

public class SpanishDeck extends Deck<SpanishCard> {

    private static ArrayList<ArrayList<SpanishCard>> getSpanishDeck() {
        SpanishCard.SCSuit[] suits = SpanishCard.SCSuit.values();
        SpanishCard.SCType[] types = SpanishCard.SCType.values();

        ArrayList<SpanishCard> initCards = new ArrayList<>(41);

        ArrayList<ArrayList<SpanishCard>> result = new ArrayList<>(2);

        for (SpanishCard.SCSuit suit : suits) {
            for (SpanishCard.SCType type : types) {
                initCards.add(new SpanishCard(suit, type));
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
