package com.TrainingDSA;
import java.util.*;

public class ShuffleTheArray1470 {
    public static void main(String[] Args)
    {
        int[] nums = {2,5,1,3,4,7};
        int n =3;

        shuffle(nums, n);
        System.out.println(Arrays.toString(nums));
    }
    static int[] shuffle(int[] nums, int n)
    {
        int[] newArr = new int[nums.length];

        for(int i =0; i<n; i++)
        {
            newArr[2*i] = nums[i];
            newArr[2*i+1] = nums[i+n];
        }

        return newArr;
    }
    }

