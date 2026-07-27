package com.dj;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class arrayIntro {
    // ::: array and arrayList :::
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


//          this is for 1-D
    /*    int[] arr = new int[4];

         for input
        System.out.println("Enter the values till 4 times: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

         for output
        System.out.println("Below is the output: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
      */

        // this is for 2-D

        int[][] arr = new int[2][2];

        //input
        System.out.println("enter digits for row and column: ");
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();

            }
        }

        // output
        System.out.println("this is the output: ");
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
