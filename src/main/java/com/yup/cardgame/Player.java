package com.yup.cardgame;

import java.util.Scanner;

public class Player {

    private String name;

    public Player(){

        Scanner nameAsker = new Scanner(System.in);

        System.out.println("\nHello! What is your name?");
        String myName = nameAsker.nextLine();
        System.out.println("Welcome to Blackjack, " + myName + "!\n");
        this.name = myName;

    }

    public String getName(){

        return name;

    }

    public void setName(String name){

        this.name = name;

    }

}