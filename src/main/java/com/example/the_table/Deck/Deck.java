package com.example.the_table.Deck;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck<T> {
    protected ArrayList<T> cards;
    protected ArrayList<T> pickedCards;

    public Deck(ArrayList<T> cards, ArrayList<T> pickedCards) {
        this.cards = cards;
        this.pickedCards = pickedCards;
    }


    public Deck(ArrayList<ArrayList<T>> cards) {
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
    public static <R> ArrayList<R> shuffleDeck(ArrayList<R> cards) {
        Collections.shuffle(cards);

        return cards;
    }

    /**
     * Adds a card to the deck if it is not already present.
     *
     * <p>This method first checks whether the specified card is already contained in the
     * {@code cards} collection. If the card is found, it returns {@code false} and no further
     * action is taken. Otherwise, the card is added to the end of the {@code cards} collection,
     * and it is removed from the {@code pickedCards} collection. The method then returns
     * {@code true}, indicating the card was successfully added.</p>
     *
     * @param card the card to be added to the deck
     * @return {@code true} if the card was successfully added to the deck,
     * {@code false} if the card is already present
     */
    public boolean addCard(T card) {
        if (cards.contains(card)) return false;

        cards.addLast(card);
        pickedCards.remove(card);
        return true;
    }

    /**
     * Retrieves the list of cards.
     *
     * @return an ArrayList containing all the cards.
     */
    public ArrayList<T> getCard() {
        return cards;
    }

    /**
     * Retrieves the list of picked cards.
     *
     * @return an ArrayList containing all the picked cards.
     */
    public ArrayList<T> getPickedCards() {
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
    public T pickFirst() {
        if (cards.isEmpty()) return null;

        T card = cards.removeFirst();
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
    public ArrayList<T> pickFirst(int numberToPick) {
        ArrayList<T> results = new ArrayList<>();

        for (int i = 1; i <= numberToPick; i++) {
            T pickedCard = pickFirst();
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
    public T pickLast() {
        if (cards.isEmpty()) return null;

        T card = cards.removeLast();
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
    public ArrayList<T> pickLast(int numberToPick) {
        ArrayList<T> results = new ArrayList<>();

        for (int i = 1; i <= numberToPick; i++) {
            T pickedCard = pickLast();
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
    public T pickRandom() {
        if (cards.isEmpty()) return null;
        Random random = new Random();
        int randomNumber = random.nextInt(count());

        T card = cards.remove(randomNumber);
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
    public ArrayList<T> pickRandom(int numberToPick) {
        ArrayList<T> results = new ArrayList<>();

        for (int i = 1; i <= numberToPick; i++) {
            T pickedCard = pickRandom();
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
