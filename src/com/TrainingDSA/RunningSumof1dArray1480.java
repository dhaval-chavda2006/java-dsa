package com.TrainingDSA;

import java.util.*;

public class RunningSumof1dArray {
    public static void main(String[] Args)
    {
        int[] nums = {1,2,3,4};
        runningSum(nums);

        System.out.println(Arrays.toString(nums));

    }
    static int[] runningSum(int[] nums) {
        // int[nums.length] newArr = new int[];

        // newArr[i] = nums[0];

        // for(int i : nums)
        // {

        // }

        for(int i =1; i<nums.length; i++)
        {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
