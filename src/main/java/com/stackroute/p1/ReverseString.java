/*reverse any string without using String Buffer.*/

package com.stackroute.p1;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        //enter a string
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        String revString = stringReverse(str);
        System.out.println(revString);
    }

    public static String stringReverse(String str) {
        //check for string reverse
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;

    }
}