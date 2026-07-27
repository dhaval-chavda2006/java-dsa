package com.dj;
import java.util.Scanner;

public class reverseno {
    public static void main(String[] Args)
    {
        // reverse the number given by user:
     Scanner sc = new Scanner(System.in);

        System.out.println("enter the number you want to make it reverse: ");
        int num = sc.nextInt();

        int ans = reverse1(num);
        System.out.println(ans);
    }

    static int reverse1(int num)
    {
        int rev =0;
        while(num!=0)
        {
            int rem = num%10;

            if((rev>Integer.MAX_VALUE/10) || (rev<Integer.MIN_VALUE/10))
            {
                return 0;
            }
            rev = rev*10+rem;
            num /=10;
        }
        return rev;
    }
}