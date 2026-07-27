package com.dj;

public class NumbersEvenDigits
{
    public static void main(String[] args)
    {
        int[] arr = {99,85,22,6,5,4444,298};
        System.out.println(findNo(arr));
    }
    static int findNo(int[] arr)
    {
        int count =0;

        for (int num:arr){
            if (divisible(num))
            {
                count++;
            }
        }
        return count;
    }
    static boolean divisible(int num)
    {
        int NoOfDigits = noofdigits(num);

        return NoOfDigits%2==0;
    }
    static int noofdigits(int num)
    {
        int count =0;
        while(num>0)
        {
            count++;
            num /=10;
        }
        return count;
    }
}
