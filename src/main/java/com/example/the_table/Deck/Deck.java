package com.example.the_table.Deck;

import com.example.the_table.Card.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class Deck {
    protected ArrayList<Card> cards;
    protected ArrayList<Card> pickedCards;

    public Deck(ArrayList<ArrayList<Card>> cards) {
        this.cards = cards.get(0);
        this.pickedCards = cards.get(1);
    }

    /**
     * Shuffles the given deck of cards in a random order.
     * <p>
     * This method uses the `Collections.shuffle()` method to randomly rearrange
     * the elements of the provided list of cards.
     *
     * @param cards the list of cards to be shuffled
     * @return the shuffled list of cards
     */
    public static ArrayList<Card> shuffleDeck(ArrayList<Card> cards) {
        Collections.shuffle(cards);

        return cards;
    }

    /**
     * Retrieves the list of cards.
     *
     * @return an ArrayList containing all the cards.
     */
    public ArrayList<Card> getCard() {
        return cards;
    }

    /**
     * Retrieves the list of picked cards.
     *
     * @return an ArrayList containing all the picked cards.
     */
    public ArrayList<Card> getPickedCards() {
        return pickedCards;
    }

    /**
     * Returns the total number of cards in the deck.
     *
     * @return the number of cards in the deck.
     */
    public int count() {
        return cards.size();
    }

    /**
     * Returns the total number of picked cards.
     *
     * @return the number of cards that have been picked.
     */
    public int countPicked() {
        return pickedCards.size();
    }

    /**
     * Picks the first card from the deck.
     * <p>
     * If the deck is empty, this method returns null. The picked card is
     * also added to the list of picked cards.
     *
     * @return the first card from the deck, or null if the deck is empty.
     */
    public Card pickFirst() {
        if (cards.isEmpty()) return null;

        Card card = cards.removeFirst();
        pickedCards.addFirst(card);

        return card;
    }

    /**
     * Picks a specified number of cards from the front of the deck.
     * <p>
     * This method attempts to pick the given number of cards. If the deck
     * has fewer cards than requested, it picks as many as possible.
     * The picked cards are returned in an ArrayList.
     *
     * @param numberToPick the number of cards to pick from the front of the deck
     * @return a list of picked cards, which may be smaller than the requested number if the deck is empty.
     */
    public ArrayList<Card> pickFirst(int numberToPick) {
        ArrayList<Card> results = new ArrayList<>();

        for (int i = 1; i <= numberToPick; i++) {
            Card pickedCard = pickFirst();
            if (pickedCard == null) break;
            results.add(pickedCard);
        }

        return results;
    }

    /**
     * Picks the last card from the deck.
     * <p>
     * If the deck is empty, this method returns null. The picked card is
     * also added to the list of picked cards.
     *
     * @return the last card from the deck, or null if the deck is empty.
     */
    public Card pickLast() {
        if (cards.isEmpty()) return null;

        Card card = cards.removeLast();
        pickedCards.addFirst(card);

        return card;
    }

    /**
     * Picks a specified number of cards from the end of the deck.
     * <p>
     * This method attempts to pick the given number of cards. If the deck
     * has fewer cards than requested, it picks as many as possible.
     * The picked cards are returned in an ArrayList.
     *
     * @param numberToPick the number of cards to pick from the end of the deck
     * @return a list of picked cards, which may be smaller than the requested number if the deck is empty.
     */
    public ArrayList<Card> pickLast(int numberToPick) {
        ArrayList<Card> results = new ArrayList<>();

        for (int i = 1; i <= numberToPick; i++) {
            Card pickedCard = pickLast();
            if (pickedCard == null) break;
            results.add(pickedCard);
        }

        return results;
    }

    /**
     * Picks a random card from the deck.
     * <p>
     * If the deck is empty, this method returns null. The picked card is
     * also added to the list of picked cards.
     *
     * @return a randomly picked card from the deck, or null if the deck is empty.
     */
    public Card pickRandom() {
        if (cards.isEmpty()) return null;
        Random random = new Random();
        int randomNumber = random.nextInt(count());

        Card card = cards.remove(randomNumber);
        pickedCards.addFirst(card);

        return card;
    }

    /**
     * Picks a specified number of random cards from the deck.
     * <p>
     * This method attempts to pick the given number of cards. If the deck
     * has fewer cards than requested, it picks as many as possible.
     * The picked cards are returned in an ArrayList.
     *
     * @param numberToPick the number of random cards to pick from the deck
     * @return a list of picked cards, which may be smaller than the requested number if the deck is empty.
     */
    public ArrayList<Card> pickRandom(int numberToPick) {
        ArrayList<Card> results = new ArrayList<>();

        for (int i = 1; i <= numberToPick; i++) {
            Card pickedCard = pickRandom();
            if (pickedCard == null) break;
            results.add(pickedCard);
        }

        return results;
    }


    @Override
    public String toString() {

        return "Deck{" +

                "cards=" + cards +
                ", pickedCards=" + pickedCards +
                '}';
    }


}
