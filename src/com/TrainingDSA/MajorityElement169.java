package com.TrainingDSA;
import java.util.*;

public class MajorityElement169 {
    public static void main(String[] Args)
    {
        int[] nums = {3,2,3};
        int ans = majorityElement(nums);

        System.out.println(ans);
    }
    static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
