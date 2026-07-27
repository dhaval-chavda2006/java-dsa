package com.dj;

public class RichCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 9, 3}, {3, 2, 1}, {9,6,1}};

        System.out.println(logic(accounts));
    }

    static int logic(int[][]accounts)
    {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowsum = 0;

            for (int col = 0; col < account.length; col++) {
                rowsum += account[col];
            }
            if (rowsum > ans) {
                ans = rowsum;
            }
        }
        return ans;
    }
}