package com.example.the_table.Card;

public record Card(CardSuit suit, CardType type) {

    @Override
    public String toString() {
        return suit + " " + type;
    }
}
