package com.dj;
import java.util.Scanner;
//import java.util.Arrays;

public class linearSearch {
   public static void main()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of array: ");
       int n = sc.nextInt();

       int[] arr = new int[n];

       System.out.println("enter all numbers: ");
       for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
       }

       linearSearch(arr, 6);

   }

   static void linearSearch(int[] arr, int key)
   {
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == key)
           {
               System.out.println("key found at index: " +i);
           }

           }
   }
}