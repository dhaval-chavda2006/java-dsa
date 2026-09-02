package com.dj;
import java.util.*;

public class RearrangeArrayElementBySign {
    public static void main(String[] Args)
    {
        int[] arr ={3,1,-2,-5,2,-4};

        int[] result = rearrange(arr);

        System.out.println(Arrays.toString(result));
    }
    static int[] rearrange(int[] arr)
    {
        int positive=0;                 // at even index == 0,2,4,6
        int negative=1;                // at odd index == 1,3,5
        // positive and negative both need pos += 2;

        int[] newArray = new int[arr.length];

        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]>0)
            {
                newArray[positive] = arr[i];
                positive += 2;
            }
            else
            {
                newArray[negative] = arr[i];
                negative += 2;
            }
        }
        return newArray;
    }
}
