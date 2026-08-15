package com.dj;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args)
    {
        int[] nums = {0,1,0,13,12};

        Zerosmoved(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void Zerosmoved(int[] nums)
    {
        int i =0;

        for(int j = 0; j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}