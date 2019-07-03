/*accept an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30*/

package com.stackroute.p1;

import java.util.Scanner;

import static java.lang.Character.isLetter;

class OddEven {

    public static void main(String[] args) {

        //input a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        System.out.println(checkOddEven(n));

    }

    public static String checkOddEven(int n)
    {
        if(isLetter(n))
            return "Please enter a number";

        //check for odd even and return message
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