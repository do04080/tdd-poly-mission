package com.II;

public class Calc {
    public static int run(String input) {
        String part=input.replace(" ", "");

        for(int i=0; i<part.length(); i++) {
            char c= part.charAt(i);
            if(c=='+'&&i>0){
                String left=part.substring(0, i);
                String right=part.substring(i+1);
                int leftNum = Integer.parseInt(left);
                int rightNum = Integer.parseInt(right);
                return leftNum + rightNum;
            }
        }

        return 0;

    }
}
