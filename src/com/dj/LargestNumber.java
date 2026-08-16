package com.dj;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args)
    {
        int[] arr = {3, 3, 0, 99, -40};

        System.out.println(largenumber(arr));
    }

    static int largenumber(int[] arr)
    {
        int largest = 0;
        for(int i =0; i < arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                largest = arr[i];
            }

        }
        return largest;
    }
}
