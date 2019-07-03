/*Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . . nth iteration.*/

package com.stackroute.p1;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {

        //take limit input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        System.out.println(printSeries(limit));
    }
        //function to print the series
        public static String printSeries(int limit) {

        int i, j;
        String str = "";
        for(i=1; i<=limit; i++) {
            for(j=1; j<=i; j++) {
                str = str + i + " ";
            }
        }

        return str;

    }
}