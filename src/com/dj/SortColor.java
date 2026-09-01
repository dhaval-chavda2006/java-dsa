package com.dj;
import java.util.*;

public class SortColor {
    //    nums = [2,0,2,1,1,0]
    //    Output: [0,0,1,1,2,2]

    public static void main(String[] Args)
    {
        int[] arr = {2,0,2,1,1,0};
        ColorSort(arr);
        System.out.println(Arrays.toString((arr)));
    }

    static void ColorSort(int[] arr)
    {
        for(int i =0; i< arr.length; i++)
        {
            for(int j = i+1; j< arr.length; j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
