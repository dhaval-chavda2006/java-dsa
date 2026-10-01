package com.TrainingDSA;

public class BestTimeToSellAndBuy121 {
    public static void main(String[] Args)
    {
        int[] nums = {7,6,4,3,1};

        int ans = MaxProfit(nums);
        System.out.println(ans);

    }
    static int MaxProfit(int[] nums)
    {
        int x = nums[0];
        int maxProfit = 0;

        for(int i =1; i<nums.length; i++)
        {
            if(nums[i] < x)
            {
                x = nums[i];
            }
            int profit = nums[i] - x;

            if(profit>maxProfit)
            {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
