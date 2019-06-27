package com.stackroute.p1;

import java.util.Scanner;

public class CheckCharacter {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(checkCharacter(ch));
    }

    public static String checkCharacter(char ch) {
        if(ch>='A' && ch<='Z') {
            return("Capital Letter");
        }
        else if(ch>='a' && ch<='b') {
            return("Small case Letter");
        }
        else if(ch>='0' && ch<='9') {
            return("Digit");
        }
        else {
            return("Special symbol");
        }


    }
}