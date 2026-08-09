package com.dj;

import java.util.Arrays;

public class BubbleSort {
    //here we will create a array and for that logic will make static method
    public static void main(String[] Args)
    {
        int[] arr = {4,8,7,9,12,10,3};

        System.out.println("the sorted output: ");
        logicBubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void logicBubble(int[] arr)
    {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j =1; j < arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
