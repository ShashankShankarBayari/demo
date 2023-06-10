package com.shashank.demo.Algorithms.StringsAndArrays.HackerRank;

import java.util.List;

public class ArrayRotation {
    /*
        12345
        23451
        34512
        45123
     */
    public List<Integer> rotateLeft(List<Integer> input, int numberOfRotations) {
        if (input.size() == 0) {
            return null;
        }
        int tempHolder;
        for (int i = 0; i < numberOfRotations; i++) {
            tempHolder = input.get(0);
            input = shiftAllElementsToLeft(input);
            input.set(input.size() - 1, tempHolder);
        }
        return input;
    }

    private static List<Integer> shiftAllElementsToLeft(List<Integer> input) {
        int i = 0;
        while (i < input.size() - 1) {
            input.set(i, input.get(i + 1));
            i++;
        }
        return input;
    }
}
