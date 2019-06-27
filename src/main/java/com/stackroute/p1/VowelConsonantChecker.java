package com.stackroute.p1;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class VowelConsonantChecker {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        word = word.toLowerCase();
        System.out.println(checkVowelConsonant(word));
    }

    public static String checkVowelConsonant(String word) {

        String str="";
        for(int i=0; i<word.length(); i++) {
            if (!isLetter(word.charAt(i))){
                return("Input is not a letter");
            }
            else {

                if(word.charAt(i)== 'a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
                {

                    str= str + "Vowel ";

                }
                else {
                    str = str + "Consonant ";
                }
            }

        }

        return str;

    }
}