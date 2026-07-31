package com.dj;

import java.util.Arrays;

public class FindPeakElement2 {
    public static void main(String[] args)
    {
        int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};

        System.out.println(Arrays.toString(findpeak(mat)));
//        System.out.println(ans);

    }

    static int[] findpeak(int[][] mat)
    {
        int s =0;
        int e = mat[0].length-1;

        while(s<=e)
        {
            int mid = s+(e-s)/2;

            int maxRow =0;

            for(int row =1; row<mat.length; row++)
            {
                if (mat[row][mid]>mat[maxRow][mid])
                {
                    maxRow = row;
                }
            }
            int current = mat[maxRow][mid];
            int left =-1;
            if(mid > 0)
            {
                left = mat[maxRow][mid-1];
            }

            int right = -1;
            if (mid<mat[0].length-1)
            {
                right = mat[maxRow][mid+1];
            }

            if(current > left && current > right)
            {
                return new int[] {maxRow,mid};
            }

            if (left > current)
            {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}
