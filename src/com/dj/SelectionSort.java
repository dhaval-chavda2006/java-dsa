package com.dj;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] Args)
    {
        int[] arr = {5,6,8,9,1,10,-65,-1};

        SortLogic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SortLogic(int[] arr)
    {
        for(int i =0; i<arr.length; i++)
        {
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr,0, last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }
}