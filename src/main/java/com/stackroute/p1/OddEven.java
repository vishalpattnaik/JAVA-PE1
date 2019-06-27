package com.stackroute.p1;

import java.util.Scanner;

class OddEven {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        System.out.println(checkOddEven(n));

    }

    public static String checkOddEven(int n)
    {
        String str="";
        if(n>=20 && n<=30){
            if((n%2)!=0) {

                str = "Tom";
            }
            else {
                str = "Jerry";
            }

        }
        else {
            str = "Number doesn't exists between 20 and 30";
        }

        return str;

    }
}