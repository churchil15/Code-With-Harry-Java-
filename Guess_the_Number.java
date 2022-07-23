package com.company;

import java.util.Scanner;
import java.util.Random;

class Game{
    private int noOfGuesses;
    int rand;

    public Game(){                            // Constructor Method which is generating a random number.
        Random r = new Random();
        rand = r.nextInt(101);         // Generated random no. is being set in rand attribute.
    }

    public int randomNo(){
        return rand;
    }

    public void setNoOfGuesses(int i){
        noOfGuesses = i;
    }

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);

        int i;
        for (i = 1;i<=100;i++) {
            System.out.println("Guess your no: ");
            int num = sc.nextInt();

            if (num > rand)
                System.out.println("Guess a smaller no.\n");

            else if (num < rand)
                System.out.println("Guess a bigger no.\n");

            else{
                isCorrectNumber();
                break;
            }
        }
        return i;
    }

    public void isCorrectNumber(){
        System.out.println("\nCongrats!!! You guessed the right no.");
    }
}

public class Guess_the_Number {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number Game!!");
        System.out.println("Number is b/w 0 - 100\n");

        Game player = new Game();       // This will invoke the constructor and will generate a random no. which user have to guess.

        player.setNoOfGuesses(player.takeUserInput());    // takeUserInput will return the no of guesses which will be used to set the no. of guesses using setter.
        System.out.println("No. of Guesses you took are: " + player.getNoOfGuesses());   // No. of guesses will be printed here

        System.out.println("Random NO. was: " + player.randomNo());       // For user satisfaction the random no. needed to be guessed will be printed at last.
    }
}
