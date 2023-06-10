package com.shashank.demo.Algorithms.Sorting;

public class SelectionSort {
    // [7, 8, 5, 2, 4, 6, 3]
    public void sort(int[] input) {
        int minimumValueIndex;

        for (int i = 0; i < input.length; i++) {
            minimumValueIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minimumValueIndex]) {
                    minimumValueIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[minimumValueIndex];
            input[minimumValueIndex] = temp;
        }

        for (int value : input) {
            System.out.println(value + " ");
        }
    }
}
