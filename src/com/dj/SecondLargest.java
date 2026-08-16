package com.dj;

public class SecondLargest {
    public static void main(String[] Args)
    {
        int[] arr = {8,8,8,8,8,8};

        System.out.println(secondlargenumber(arr));
    }

    static int secondlargenumber(int[] arr)
    {
        int largest = arr[0];
        for(int i =1; i < arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                largest = arr[i];
            }
        }

        int secondlargest = -1;
        for(int j =0; j < arr.length-1; j++)
        {
            if (arr[j] == largest)
            {
                continue;
            }

            if(arr[j]>secondlargest)
            {
                secondlargest = arr[j];
            }

        }

        return secondlargest;
    }

}
