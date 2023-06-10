package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

public class MMonotonicArray {

    public static boolean isMonotonic(int[] array) {
        // -1 denotes -ve trend and +1 denotes +ve trend
        int trend = 0;
        if (array.length == 0 || array.length == 1)
            return false;
        trend = defineTrend(0, 1, array);
        for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] > 0) {
                if (trend == -1) {
                    return false;
                }
            } else if (array[i] - array[i - 1] < 0) {
                if (trend == 1) {
                    return false;
                }
            } else if (array[i] - array[i - 1] == 0) {
                if (trend == -1 || trend == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int defineTrend(int first, int second, int[] array) {
        if (array[second] - array[first] > 0) {
            return 1;
        } else if (array[second] - array[first] < 0) {
            return -1;
        } else {
            if (second == array.length - 1) {
                return 1;
            } else {
                return defineTrend(first + 1, second + 1, array);
            }
        }
    }
}
