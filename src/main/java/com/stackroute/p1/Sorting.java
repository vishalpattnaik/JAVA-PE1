package com.stackroute.p1;

public class Sorting
{

    public static String numberSort(int num)
    {
        String output="";

        String s1 = Integer.toString(num);
        char[] s2 = s1.toCharArray();
        int n = s2.length;
        int i = 0;
        int sum=0;

        for (i = 0; i < (n - 1); i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (s2[j] > s2[min_idx])
                    min_idx = j;


            char temp = s2[min_idx];
            s2[min_idx] = s2[i];
            s2[i] = temp;
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(s2[j]);
            char k=s2[j];

            if(k%2==0)
            {
                sum=sum+(k-48);

            }
        }
        System.out.println();

        if(sum>15)
        {

            return  (output=output+"true");
        }
        else
        {
            return   (output=output+"false");
        }

    }

}