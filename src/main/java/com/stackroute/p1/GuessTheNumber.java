package com.stackroute.p1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // write your code here


        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println(guessTheNumber(randomNumber));

    }

    public static String guessTheNumber(int randomNumber) {

        Scanner sc = new Scanner(System.in);

        int yourGuess;

        String str = "";

        do {

            System.out.println("Guess a number from 1-100");
            yourGuess = sc.nextInt();

            if(yourGuess>randomNumber){
                System.out.println("Number guessed is more than original number");
            }

            else if(yourGuess<randomNumber){
                System.out.println("Number guessed is less than original number");
            }

            else {

                str = "Number guessed matches the original number";

            }


        }while(yourGuess!=randomNumber);

        return str;

    }
}