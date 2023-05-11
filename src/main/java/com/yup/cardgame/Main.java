package com.yup.cardgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create our deck of 52 cards
        boolean gameOn = true;
        Scanner askForHit = new Scanner(System.in);
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        Player player1 = new Player();
        Player player2 = new Player();
        deck.shuffle();

        String playerOne = player1.getName();
        String playerTwo = player2.getName();

        while(gameOn){

            System.out.println(playerOne + "'s deck:");
            for(int i = 0; i < 2; i++){

                Card card = deck.deal();
                card.flip();
                System.out.println(card.getSuit());
                System.out.println(card.getValue());
                hand1.deal(card);

                if(hand1.getValue() < 21){

                    System.out.println("Would you like to hit? (Y/N)");
                    String hitAns = askForHit.next();

                    switch(hitAns){

                        case "Y":
                            hand1.deal(card);

                        case "N":
                            break;
                    }

                }

            }

            System.out.println("The total points of " + playerOne + "'s hand is: " + hand1.getValue() + "\n");

            System.out.println(playerTwo + "'s deck:");
            for(int i = 0; i < 2; i++){

                Card card = deck.deal();
                card.flip();
                System.out.println(card.getSuit());
                System.out.println(card.getValue());
                hand2.deal(card);

            }

            System.out.println("The total points of " + playerTwo + "'s hand is: " + hand2.getValue() + "\n");

            if(hand1.getValue() > hand2.getValue()){

                System.out.println(playerOne + " is the winner!");

            }
            else{

                System.out.println(playerTwo + " is the winner!");

            }

            gameOn = false;

        }

    }

}