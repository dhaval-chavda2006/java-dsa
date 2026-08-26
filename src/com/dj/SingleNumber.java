package com.dj;

public class SingleNumber {
    public static void main(String[] Args)
    {
        int[] arr = {2};
        int ans = singlenumber(arr);
        System.out.println(ans);
    }
    static int singlenumber(int[] arr)
    {
        int n = arr.length;
        int ans =0;

        for(int i =0; i<n; i++)
        {
            ans ^= arr[i];
        }
        return ans;
    }
}
