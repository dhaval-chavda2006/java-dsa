package com.TrainingDSA;
import java.util.*;

public class NumbersWithEvenDigit1295 {
    public static void main(String[] Args)
    {
        int[] nums = {555,901,482,1771};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums)
    {
        int count = 0;

        for(int i: nums)
        {
            if(even(i))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int i)
    {
        int noofdigit = digit(i);

        return noofdigit%2==0;
    }

    static int digit(int i)
    {
        int count =0;
        while(i>0)
        {
            count++;
            i/=10;
        }
        return count;
    }
}
