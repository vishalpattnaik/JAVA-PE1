package com.stackroute.p1;

import java.util.Scanner;


class CheckInteger {

    public static String integerCheck(String num)

    {


        String[] numStr = num.split(" ");
        int sum = 0, k = 0;
        for (int i = 0; i < numStr.length; i++) {
            if (Character.isLetter(numStr[i].charAt(0))) {
                k=1;
                return("character found");

            } else if (Integer.parseInt(numStr[i]) >= 0) {
                sum = sum + Integer.parseInt(numStr[i]);

            } else {
                k = 1;
                return("special character");

            }
        }
        if (k == 0)
            return ("sum "+sum);
        else
            return null;
    }

}