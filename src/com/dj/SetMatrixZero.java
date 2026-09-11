package com.dj;
import java.util.*;

public class SetMatrixZero {
    public static void main(String[] args)
    {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
    static void setZeroes(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i =0; i<m; i++)
        {
            for(int j =0; j<n; j++)
            {
                if(matrix[i][j]==0){
                    row[i] =true;
                    col[j] =true;
                }
            }
        }


        for(int i =0; i<m; i++)
        {
            for(int j =0; j<n; j++)
            {
                if(row[i] == true || col[j] == true){
                    matrix[i][j] =0;
                }
            }
        }


    }

}
