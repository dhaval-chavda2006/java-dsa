package com.dj;
import java.util.Arrays;

public class rotateArrayBy1 {
    public static void main(String[] args)
    {
        int[] nums = { 2, 3, 4, 5};
        rotate(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void rotate(int[] nums)
    {
        int first = nums[0];
        int n = nums.length-1;

        for (int i = 0; i < n; i++)
        {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = first;
    }
}
