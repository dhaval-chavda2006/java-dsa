package com.TrainingDSA;

public class Palindrome {
    public static void main(String[] Args)
    {
        int x = 123;

        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        if (x < 0) return false;

        long original = x;
        long reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed == original;
    }
}
