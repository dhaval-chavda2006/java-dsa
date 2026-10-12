package com.TrainingDSA;

public class LengthOfLastWord58 {
    public static void main(String[] Args)
    {
        String s = "Hello World";
        int ans = lengthoflastword(s);
        System.out.println(ans);

    }
    static int lengthoflastword(String s)
    {
        int count = 0;

        for(int i = s.length()-1; i>=0; i--) {
            if (s.charAt(i) != ' ')
            {
                count++;
            }
            else if(count>0){
                break;
            }
        }
        return count;
    }
}
