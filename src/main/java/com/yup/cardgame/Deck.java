package com.yup.cardgame;

import java.util.*;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){

        this.cards = new ArrayList<Card>();
        String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A" };

        // Nested for loops
        // Building all the cards in the deck and adds them to the deck
        for(CardSuits suit : CardSuits.values()){          // This loops through the suits (Hearts, Clubs, Diamonds, Spades)

            for(String value : values){                    // This loops through the values (2, 3, 4, 5, 6, etc)

                Card card = new Card(suit, value);
                cards.add(card);

            }

        }

    }

    public Card deal(){

        // We can't deal cards if there aren't any left
        // Check if the deck has any cards
        // If the deck does not have any cards left, return null
        // If the deck does have cards left
            // Take the top card, or the card at index 0, and return it
            // Remove the card from index 0

        if(this.cards.size() > 0){

            Card card = this.cards.remove(0);
            return card;

        }
        else{

            return null;

        }

    }

    public int getSize(){

        return this.cards.size();

    }

    public void shuffle(){

        Collections.shuffle(cards);

    }

}