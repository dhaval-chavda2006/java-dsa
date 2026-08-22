package com.dj;

public class RotateArrayByK {
    public static void main(String[] Args) {
        int[] nums = {1, 2, 3, 4, 5};
        Rotate(nums, 2);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }

    }

    static void reverse(int[] nums, int s, int e) {


        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;

            s++;
            e--;
        }
    }

    static void Rotate(int[] nums, int k)
    {
        k = k%nums.length;

        if(k<0)
        {
            k = k+nums.length;
        }

        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
}