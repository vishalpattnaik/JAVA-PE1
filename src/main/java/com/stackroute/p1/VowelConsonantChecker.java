/*accept a word as input and checks for each single character letter in
the word whether it is a consonant or vowel.
Condition:
a. Print an error message if the input is not a letter
b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter*/

package com.stackroute.p1;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class VowelConsonantChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        word = word.toLowerCase();
        System.out.println(checkVowelConsonant(word));
    }

    public static String checkVowelConsonant(String word) {

        String str="";
        for(int i=0; i<word.length(); i++) {
            if (!isLetter(word.charAt(i))){         //check for not a letter
                return("Input is not a letter");
            }
            else {

                if(word.charAt(i)== 'a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
                {

                    str= str + "Vowel ";        //check fpr vowel

                }
                else {
                    str = str + "Consonant ";       //else check for consonant
                }
            }

        }

        return str;

    }
}