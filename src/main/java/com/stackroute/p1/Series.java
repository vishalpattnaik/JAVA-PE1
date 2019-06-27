package com.stackroute.p1;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        System.out.println(printSeries(limit));
    }

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