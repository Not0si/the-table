package com.example.the_table.Card;


public record SpanishCard(SCSuit suit, SCType type) {

    public enum SCSuit {
        CUP, COIN, SWORD, CLUB
    }

    public enum SCType {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, KNIGHT, KING
    }

    @Override
    public String toString() {
        return suit + " " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpanishCard that = (SpanishCard) o;
        return suit == that.suit && type == that.type;
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
