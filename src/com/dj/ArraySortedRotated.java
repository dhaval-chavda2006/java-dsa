package com.dj;

public class ArraySortedRotated {
    public static void main(String[] args)
    {
        int[] nums = {2,3,4,1};

        System.out.println(check(nums));

    }
    static boolean check(int[] nums)
    {
        int count =0, n = nums.length;

        for(int i =1; i <n ; i++)
        {
            if(nums[i-1] > nums[i]) count++;

            if (nums[n-1] > nums[0]) count++;
        }

        return count <= 1;
    }
}
