package com.TrainingDSA;

public class MergeStringAlternate1768 {
    public static void main(String[] Args)
    {
        String w1 = "abc";
        String w2 = "pqr";

        String ans = mergeAlternately(w1,w2);
        System.out.println(ans);

    }
    static String mergeAlternately(String w1, String w2)
    {
        int n1 = w1.length();
        int n2 = w2.length();

        StringBuilder res = new StringBuilder();
        int i = 0;

        while (i < n1 && i < n2) {
            res.append(w1.charAt(i));
            res.append(w2.charAt(i));
            i++;
        }

        while (i < n1) {
            res.append(w1.charAt(i));
            i++;
        }

        while (i < n2) {
            res.append(w2.charAt(i));
            i++;
        }

        return res.toString();
    }
}
