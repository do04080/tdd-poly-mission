package com.II;

public class Calc {
    public static int run(String input) {
        input=input.replace(" ", "");

        for(int i=0; i<input.length(); i++) {
            char c= input.charAt(i);
            if((c=='+'||c=='-')&&i>0){
                String left=input.substring(0, i);
                String right=input.substring(i+1);
                int leftNum = Integer.parseInt(left);;
                int rightNum = Integer.parseInt(right);;
                return c=='+'?leftNum + rightNum: leftNum - rightNum;
            }
        }

        return 0;

    }
}
