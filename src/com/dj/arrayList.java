package com.dj;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] arg)
    {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);

//        list.add(5);
//        list.add(56);
//        System.out.println(list);
//        list.set(0,99); // to change value at any particular index
//        System.out.println(list);


        System.out.println("enter the total number you want to input: ");
        int usr = sc.nextInt();
        //input for arrayList
        System.out.println("Taking input: ");
        for (int i = 0; i < usr ; i++) {
            list.add(sc.nextInt());
        }

        //output for arrayList
        System.out.println("Providing output: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(list);
        }
    }
}
