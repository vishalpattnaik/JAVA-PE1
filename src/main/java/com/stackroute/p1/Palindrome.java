package com.stackroute.p1;

import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = sc.nextLong();

        System.out.println(checkPalindrome(n));

    }

    public static String checkPalindrome(long n) {


        long num=n;
        long r=0;
        while(n>0) {

            long d=n%10;
            r=(r * 10)+d;
            n=n/10;

        }

        if(num==r) {
            long d, sum=0;
            while(num>0) {
                d=num%10;
                if(d%2==0) {
                    sum = sum+d;
                }

                num=num/10;
            }
            if(sum > 25) {
                return(r + " is palindrome and sum of even numbers is greater than 25.");
            }
            else {
                return(r + " is palindrome and sum of even numbers is less than 25.");
            }
        }
        else {
            return(num + " is not palindrome.");
        }


    }
}