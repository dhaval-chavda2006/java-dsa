package com.dj;

import java.util.*;
/*
* Find missing number
* Input: nums = [0, 2, 3, 1, 4]
* Output: 5
*/

public class MissingNumber {
    public static void main(String[] Args)
    {
        int[] arr = {0,2,3,1,4};

        System.out.println(Missing(arr));
    }
    static int Missing(int[] arr)
    {
        int n = arr.length;
        int actual=0;
        int expect=(n*(n+1))/2;

        for(int i =0 ;i<n; i++)
        {
            actual += arr[i];
        }

        return expect-actual;
    }
}
