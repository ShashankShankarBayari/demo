package com.shashank.demo.Algorithms.StringsAndArrays;

public class FindPermutationsOfAString {

    public void compute(String input, String answer) {
        if (input.length() == 0) {
            System.out.print(answer + " ");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String restOfString = input.substring(0, i) + input.substring(i + 1);
            compute(restOfString, answer + ch);
        }
    }
}
