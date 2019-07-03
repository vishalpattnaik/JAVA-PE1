/*Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
repeat n number of times in the output String.*/

package com.stackroute.p1;

import java.util.Scanner;

public class StringInteger{

    public static void main(String[] args) {

        //enter a string and integer
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and an integer: ");
        String input1 = sc.next();
        int input2 = sc.nextInt();

        String resultString = repeatString(input1, input2); //call repeatString method

        System.out.println(resultString);

    }

    //repeat the string accoding to the value
    public static String repeatString(String input1, int input2) {

        String substr = input1.substring(input1.length()-input2);

        for(int i=1; i<=input2; i++) {

            input1=input1 + substr;
        }

        return input1;

    }
}