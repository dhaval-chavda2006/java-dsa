package com.dj;

public class MaxConsecutiveOne {
    public static void main(String[] Args)
    {
        int[] arr = {1,1,0,1,1,1};

        System.out.println(MaxConsecutive(arr));
    }
    static int MaxConsecutive(int[] arr)
    {
        int count = 0;
        int maxCount =0;

        for(int i:arr) {
            if (i == 1) {
                count++;

                // Update maximum if current count is greater
                if (count > maxCount) {
                    maxCount = count;
                }
            }

            // If the current element is 0,
            // consecutive sequence is broken
            else {
                count = 0;
            }
        }
        return maxCount;
    }
}
