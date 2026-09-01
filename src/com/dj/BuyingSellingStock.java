package com.dj;
import java.util.*;

public class BuyingSellingStock {
    public static void main(String[] Args)
    {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices)
    {
        int maxProfit=0;
        for(int i =0; i<prices.length-1; i++)
        {
            for(int j=i+1; j<prices.length;j++)
            {
                int profit = prices[j] - prices[i];

                if(profit> maxProfit)
                {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}


class Optimization{
    static int optimize(int[] prices)
    {
        int small = prices[0];
        int maxProfit = 0;

        for(int i =1; i<prices.length; i++)
        {
            if (prices[i] < small) {
                small = prices[i];
            }

            int profit = prices[i] - small;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}