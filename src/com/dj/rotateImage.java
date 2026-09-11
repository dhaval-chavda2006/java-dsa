package com.dj;

public class rotateImage {
    public static void main(String[] Args)
    {
        int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        for (int i = 0; i < arr.length; i++)
        {
            for(int j =i; j < arr.length; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i =0; i<arr.length; i++)
        {
            ReverseArr(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void ReverseArr(int[] rows)
    {
        int s=0;
        int e = rows.length-1;

        while(s<e)
        {
            int temp = rows[s];
            rows[s] = rows[e];
            rows[e] = temp;

            s++;
            e--;
        }
    }
}