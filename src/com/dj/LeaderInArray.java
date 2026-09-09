package com.dj;
import java.util.*;

public class LeaderInArray {

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 5, 3, 1, 2};

        List<Integer> result = leaders(arr);
        System.out.println(result);

    }
    static List<Integer> leaders(int[] arr)
    {
        int n = arr.length-1;
        ArrayList<Integer> ll = new ArrayList<>();
        int largest = arr[n];
        ll.add(arr[n]);

        for(int i = n-1; i>=0; i--)
        {
            if(arr[i]>largest)
            {
                ll.add(arr[i]);
                largest = arr[i];
            }
            else{
                continue;
            }
        }
        Collections.reverse(ll);
        return ll;
    }
}
