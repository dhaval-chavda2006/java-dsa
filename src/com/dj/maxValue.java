package com.dj;

import java.util.Scanner;
import java.util.ArrayList;

// find the maximum value from the arraylist
// find the maximum value's index from the arrayList

public class maxValue {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        System.out.println("enter the total number you want to enter: ");
        int usr = sc.nextInt();

        //input
        for (int i = 0; i < usr; i++) {
            list.add(sc.nextInt());
        }

        //output
        int ans = MaxiVal(list);
        System.out.println(ans);

    }

    static int MaxiVal(ArrayList<Integer> list)
    {
        int maxval = list.getFirst();

        for (int i = 1; i < list.size(); i++) {
            if (maxval<list.get(i)) maxval=list.get(i);
        }
        return maxval;
    }
}
