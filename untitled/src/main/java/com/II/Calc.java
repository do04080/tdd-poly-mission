package com.II;

public class Calc {
    public static int run(String input) {
        String part = input.replace(" ", "");

        for(int i = part.length()-1; i >=0; i--) {
            char c = part.charAt(i);

            if (c == '/') {
                String left = part.substring(0, i);
                String right = part.substring(i + 1);
                return run(left) / run(right);
            }
        }
        for (int i = part.length()-1; i >=0; i--) {
            char c = part.charAt(i);
            if (c == ')') {
                int j = i;
                int count = 1;
                while (j >=0 &&count>0) {
                    j--;
                    if(part.charAt(j)==')'){
                        count++;
                    }
                    if(part.charAt(j)=='('){
                        count--;
                    }
                }
                if (j < i) {
                    if (j == 0 && i == part.length() - 1) {
                        return run(part.substring(j + 1, i));
                    }
                    String innerPart = part.substring(j + 1, i);
                    String left = part.substring(0, j);
                    String right = part.substring(i + 1);
                    return run(left + run(innerPart) + right);
                }
            }
        }

        for (int i = part.length()-1; i >=0; i--) {
            char c = part.charAt(i);

            if ((c == '+' || c == '-') && i>0&& !(part.charAt(i-1)+"").matches("[+\\-*]")) {
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