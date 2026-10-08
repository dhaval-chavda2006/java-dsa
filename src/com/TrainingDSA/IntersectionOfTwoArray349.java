package com.TrainingDSA;
import java.util.*;
public class IntersectionOfTwoArray349 {
    public static void main(String[] Args)
    {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        intersection(arr1, arr2);
    }
    static int[] intersection(int[] arr1, int[] arr2)
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Set<Integer> intersection = new HashSet<>();
        int i=0, j=0;

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] == arr2[j])
            {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr2[j] > arr1[i])
            {
                i++;
            }
            else{
                j++;
            }
        }
        int curr = 0;
        int k = intersection.size();
        int[] result = new int[k];

        for(int x: intersection)
        {
            result[curr++] = x;
        }
        return result;
    }
}
