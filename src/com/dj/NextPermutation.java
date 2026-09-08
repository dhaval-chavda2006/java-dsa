package com.dj;
import java.util.*;

public class NextPermutation {

    public static void main(String[] Args)
    {
        int[] nums = {1,2,3};

        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void nextPermutation(int[] nums)
    {
        int i = nums.length - 2;

        // Step 1: Find the first smaller element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find a bigger element and swap
        if (i >= 0) {

            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        // Step 3: Reverse the remaining part
        reverse(nums, i + 1, nums.length - 1);
    }

    static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }


}
