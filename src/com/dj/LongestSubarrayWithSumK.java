package com.dj;

import java.util.*;
//     ------- i think i need to do sliding window ------

public class LongestSubarrayWithSumK {
    public static void main(String[] Args)
    {
        int[] arr = {-3, 2, 1};
        int k=15;

        int ans = longestsubarray(arr,k);
        System.out.println(ans);
    }

    static int longestsubarray(int[] arr, int k)
    {
        int n  = arr.length-1;
        int maxLength = 0;

        for(int i =0; i<=n; i++)
        {
            int temp =0;

            for(int j =i; j<=n; j++)
            {
                temp += arr[j];
                if(temp == k)
                {
                    maxLength = Math.max(maxLength,j-i+1);
                }

            }
        }
            return maxLength;
    }
}
