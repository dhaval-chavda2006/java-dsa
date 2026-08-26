package com.dj;
import java.util.*;

public class TwoSum {
    public static void main(String[] Args)
    {
        int[] arr = {2,7,11,15};
        twoSum(arr,5);
        System.out.println(Arrays.toString(arr));

        //return indices which summation is target
    }

    static int[] twoSum(int[] arr, int target)
    {
        // i can use hashMap number[2+7=9] -> index[0,1] !!
        HashMap<Integer, Integer> temp = new HashMap<>();

        for(int i =0; i<arr.length; i++)
        {
            int require = target - arr[i];

            if(temp.containsKey(require))
            {
                return new int[]{temp.get(require)};
            }
            temp.put(arr[i], i);
        }
        return new int[]{};

    }
}
