package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MMergeOverlappingIntervals {

    public int[][] merge(int[][] array) {
        List<int[]> outputList = new ArrayList<>();

        Arrays.sort(array, Comparator.comparingInt(a -> a[0]));
        int i = 0;
        int[] previousInterval = array[0];
        int[] currentInterval = new int[2];

        while (i < array.length) {
            currentInterval = array[i];

            if (previousInterval[1] >= currentInterval[0]) {
                previousInterval[1] = Math.max(currentInterval[1], previousInterval[1]);
            } else {
                outputList.add(previousInterval);
                previousInterval = currentInterval;
            }
            i++;
        }
        outputList.add(previousInterval);
        return outputList.toArray(new int[outputList.size()][]);

    }
}
// temp 3,8
//1,2 |
