package com.shashank.demo.Algorithms.StringsAndArrays.HackerRank;

import java.util.Arrays;

public class FindMatchingPairs {

    public int find(int[] inputArray) {
        if (inputArray.length == 0)
            return 0;

        Arrays.sort(inputArray);
        int resultCounter = 0;
        int i = 0;
        while (i < inputArray.length - 1) {
            if (inputArray[i] == inputArray[i + 1]) {
                resultCounter++;
                i = i + 2;
            } else {
                i = i + 1;
            }
        }
        return resultCounter;
    }
}
