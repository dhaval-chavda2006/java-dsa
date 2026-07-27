package com.dj;

public class BinarySearch {
    public static void main(String[] Args)
    {
        int[] arr = {1,2,3,4,6,9,88};

        int target = 6;
        int ans = bsearch(arr,target);
        System.out.println(ans);
    }

    static int bsearch(int[] arr, int target)
    {
        int s=0;
        int e=arr.length-1;

        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if (target < arr[mid])
            {
                e = mid -1;
            }
            else if (target > arr[mid])
            {
                s = mid +1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}