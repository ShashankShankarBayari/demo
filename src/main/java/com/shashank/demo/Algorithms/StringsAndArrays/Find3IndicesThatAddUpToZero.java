package com.shashank.demo.Algorithms.StringsAndArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find3IndicesThatAddUpToZero {
    /*
    Input: [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    */

    private Map<Integer, Integer> lookUpTable = new HashMap<>();

    public void compute(int[] inputArray) {
        List<String> output = new ArrayList<>();
        Arrays.sort(inputArray);
        buildLookupTable(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            int currentTarget = 0 - inputArray[i];
            if (inputArray[i] != inputArray[i + 1]) {
                find2Sum(currentTarget, inputArray, i);
            }
        }
    }

    private void find2Sum(int targetSum, int[] inputArray, int currentIndex) {
        int[] result = new int[3];
        for (int j = currentIndex + 1; j < inputArray.length; j++) {
            Integer indexOfFoundElement = lookUpTable.get(targetSum - inputArray[j]);
            if (indexOfFoundElement != null && inputArray[indexOfFoundElement] != inputArray[j]
                    && indexOfFoundElement > j) {
                result[0] = inputArray[currentIndex];
                result[1] = inputArray[j];
                result[2] = inputArray[indexOfFoundElement];
                printoutput(result);
            }
        }
    }

    private void printoutput(int[] result) {
        for (int element : result) {
            System.out.println(element + ",");
        }
        String newLine = System.getProperty("line.separator");
        System.out.println(newLine);
    }

    private void buildLookupTable(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            lookUpTable.put(inputArray[i], i);
        }
    }

}
