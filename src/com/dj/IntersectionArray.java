package com.dj;
/*
* nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
*/
import java.util.*;

public class IntersectionArray {
    public static void main(String[] Args)
    {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};


    }

    static int[] intersection(int[] arr1, int[] arr2)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0,j=0;
        Set<Integer> intersection = new HashSet<>();

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j])
            {
                i++;
            }
            else{
                j++;
            }
        }
        int k = intersection.size();
        int[] result = new int[k];
        int current =0;

        for(int x: intersection)
        {
            result[current++] = x;
        }
        return result;

    }
}
