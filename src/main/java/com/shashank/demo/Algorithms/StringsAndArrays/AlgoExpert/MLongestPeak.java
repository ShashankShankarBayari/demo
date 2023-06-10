package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

public class MLongestPeak {

    // [1,2,3,3,4,0,10,6,5,-1,-3,2,3]

    public int find(int[] array) {
        int i = 1, maxPeak = 0, left = 0, right = 0;

        while (i < array.length - 1) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                left = i - 1;
                while (left > 0 && array[left] > array[left - 1])
                    left--;
                right = i + 1;
                while (right < array.length - 1 && array[right] > array[right + 1])
                    right++;
                maxPeak = Math.max(maxPeak, (right - left) + 1);
                i = right;
            } else {
                i++;
            }
        }
        return maxPeak;
    }
}
