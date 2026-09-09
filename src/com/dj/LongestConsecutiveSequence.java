package com.dj;
import java.util.*;

/*
* The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
* */
public class LongestConsecutiveSequence {

    public static void main(String[] args)
    {
        int[] arr={100,4,200,1,3,2};

        int answer = longestConsecutive(arr);
        System.out.println(answer);


    }

    static int longestConsecutive(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for(int num : set) {

            // Start only if num is the beginning
            if(!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while(set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
