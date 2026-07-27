package com.dj;

public class SearchInRotatedArray {
    public static void main(String[] args)
    {
        int[] nums = {4,5,6,7,0,1,2};
        int target =0;

        int ans = logic(nums,target);
        System.out.println(ans);
    }

    static int logic(int[] nums, int target)
    {

        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[s] <= nums[mid]) {

                // Target lies inside left half
                if (target >= nums[s] && target < nums[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }

            }
            // Right half is sorted
            else {

                // Target lies inside right half
                if (target > nums[mid] && target <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }
}
