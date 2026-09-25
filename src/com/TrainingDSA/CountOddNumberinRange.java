package com.TrainingDSA;

public class CountOddNumberinRange {
    public static void main(String[] Args)
    {
        System.out.println(countOdds(5,10));

    }
    static int countOdds(int low, int high) {
            // int count =0;
            //  for(int i = low; i<=high; i++)
            //  {
            //     if(i%2 != 0)
            //     {
            //         count++;
            //     }
            //  }
            //  return count;

            return (high+1)/2 - low/2;
    }
}