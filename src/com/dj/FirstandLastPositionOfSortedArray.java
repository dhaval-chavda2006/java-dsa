package com.dj;

import java.util.Arrays;
public class FirstandLastPositionOfSortedArray {
    public static void main(String[] args)
    {
//        System.out.println("hello world");

        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(lastmerge(nums,target)));

    }

    static int firstOccurence(int[] nums, int target)
    {
        int s =0, e = nums.length -1;
        int ans =-1;

        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(target == nums[mid])
            {
                ans = mid;
                e = mid-1;
            }
            else if(target > nums[mid])
            {
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }

    static int lastOccurence(int[] nums, int target)
    {
        int s =0, e = nums.length -1;
        int ans =-1;

        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(target == nums[mid])
            {
                ans = mid;
                s = mid+1;
            }
            else if(target > nums[mid])
            {
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }

    static int[] lastmerge(int[] nums, int target)
    {
        int[] ans = {-1,-1};

        ans[0] = firstOccurence(nums, target);
        ans[1] = lastOccurence(nums, target);

        return ans;
    }
}
