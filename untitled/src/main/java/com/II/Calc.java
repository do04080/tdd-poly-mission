package com.II;

public class Calc {
    public static int run(String input) {
        String part = input.replace(" ", "");


        for (int i = part.length()-1; i >=0; i--) {
            char c = part.charAt(i);
            if ((c == '+' || c == '-') && i > 0) {
                String left = part.substring(0, i);
                String right = part.substring(i + 1);
                return c=='+'?run(left) + run(right): run(left) - run(right);
            }
        }
        for(int i = part.length()-1; i >=0; i--) {
            char c = part.charAt(i);
            if (c == '*' ) {
                String left = part.substring(0, i);
                String right = part.substring(i + 1);
                return run(left) * run(right);
            }
        }

        return Integer.parseInt(part);

    }
}