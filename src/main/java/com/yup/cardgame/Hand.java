package com.yup.cardgame;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand(){

        this.cards = new ArrayList<Card>();

    }

    public void deal(Card card){

        this.cards.add(card);

    }

    public int getSize(){

        return this.cards.size();

    }

    public int getValue(){

        int value = 0;

        for(Card card: cards){
            card.flip();
            value += card.getPointValue();
            card.flip();
        }

        return value;

    }

}