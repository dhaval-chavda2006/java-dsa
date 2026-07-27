package com.dj;
import java.util.Scanner;
import java.util.ArrayList;

public class swapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        //taking input
        System.out.println("enter the total number you want to print: ");
        int usr = sc.nextInt();

        System.out.println("enter the numbers for input: ");
        for (int i = 0; i < usr; i++) {
            list.add(sc.nextInt());
        }
        swapping(list,3,5);
        System.out.println(list);

    }
    static void swapping(ArrayList<Integer> list, int index1, int index2)
    { // swap i =3 , i = 5

            int temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2,temp);

    }
}
