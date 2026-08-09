package com.dj;

import java.util.Arrays;
import static com.dj.SelectionSort.swap;

public class InsertionSort {
    public static void main(String[] Args)
    {
        int[] arr = {-1,5,66,75,6,10,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void insertion(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = i+1; j > 0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
}
