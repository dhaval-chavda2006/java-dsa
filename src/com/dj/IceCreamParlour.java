package com.dj;

public class IceCreamParlour {

    public static void main(String[] args)
    {
        int[] arr = {1,4,9,10,5,2};
//        int money = 6;

        logic(arr,6);

    }
    static void logic(int[] arr, int money)
    {
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            int sum =0;

            for (int j =i+1; j<arr.length; j++)
            {
                sum = arr[i] + arr[j];

                if (money == sum)
                {
                    System.out.println(+(i+1));
                    System.out.println(+(j+1));

                    return;
                }

            }
        }
    }

}
