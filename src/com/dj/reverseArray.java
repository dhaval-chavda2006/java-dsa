package com.dj;

import java.util.Scanner;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter all numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reversing(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reversing(int[] arr)
    {
        int s = 0;
        int e = arr.length-1;

        while(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }
}