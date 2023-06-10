package com.shashank.demo.Algorithms.StringsAndArrays;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
public class Find2IndicesThatAddUpToATarget {

    public int[] compute(int[] inputArray, int targetSum) {
        int[] outputArray = new int[2];
        Map<Integer, Integer> lookUpTable = new HashMap<>();
        if (targetSum == 0)
            return null;
        for (int i = 0; i < inputArray.length; i++) {
            int currentElement = inputArray[i];
            if (currentElement < targetSum) {
                lookUpTable.put(inputArray[i], i);
            }
        }
        for (int j = 0; j < inputArray.length; j++) {
            Integer indexOfFoundElement = lookUpTable.get(targetSum - inputArray[j]);
            if (indexOfFoundElement != null && inputArray[indexOfFoundElement] != inputArray[j]) {
                outputArray[0] = inputArray[j];
                outputArray[1] = inputArray[indexOfFoundElement];
            }
        }
        return outputArray;
    }
}
