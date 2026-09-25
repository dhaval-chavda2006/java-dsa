package com.TrainingDSA;

public class SmallestEvenMultiple {

    public static void main(String[] Args)
    {
        System.out.println(smallestEvenMultiple(6));
    }
    static int smallestEvenMultiple(int n) {
        if(n%2 == 0)
        {
            return n;
        }
        return n*2;
    }
}
