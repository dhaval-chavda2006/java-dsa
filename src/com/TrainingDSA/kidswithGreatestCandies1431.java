package com.TrainingDSA;
import java.util.*;

public class kidswithGreatestCandies1431 {
    public static void main(String[] Args)
    {
        int[] candies = {3,4,5,61,3,4,9};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies,extraCandies));

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> l = new ArrayList<>();

        int sum = 0;

        int maxsum =0;

        for(int i : candies)
        {
            if(i>maxsum)
            {
                 maxsum=i;
            }
        }

        for(int i = 0; i < candies.length; i++)
        {
            sum = candies[i] + extraCandies;
            if(sum < maxsum)
            {
                l.add(false);
            }
            else
            {
                l.add(true);
            }
        }
        return l;
    }
}
