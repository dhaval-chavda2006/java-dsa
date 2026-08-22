package com.dj;

import java.util.*;
/*
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

Output: [1, 2, 3, 4, 5, 7]

Explanation:
The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
 */

public class UnionSortedArrays {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,7};

    ArrayList<Integer> result = unionArray(arr1,arr2);
        System.out.println(result);
    }

    static ArrayList<Integer> unionArray(int[] arr1, int[] arr2)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int i=0, j=0;

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                temp.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j])
            {
                temp.add(arr1[i]);
                i++;
            }
            else {
                temp.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length)
        {
            if(arr1[i]==arr1[i-1])
            {
                i++;
                continue;
            }
            temp.add(arr1[i]);
            i++;
        }
        while(j<arr2.length)
        {
            if(arr2[j]==arr2[j-1])
            {
                j++;
                continue;
            }
            temp.add(arr2[j]);
            j++;
        }
        return temp;
    }
}

