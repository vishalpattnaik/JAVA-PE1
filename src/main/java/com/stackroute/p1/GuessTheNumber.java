/*Accept a number from user as input (set the limit say 1 - 50 or 1 -
100) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
a. Number guessed is more than original number
b. Number guessed is less than original number
c. Number guessed matches the original number*/

package com.stackroute.p1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        //generate random number
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println(guessTheNumber(randomNumber));

    }

    public static String guessTheNumber(int randomNumber) {


        //guess a number and check if it matches the random number
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