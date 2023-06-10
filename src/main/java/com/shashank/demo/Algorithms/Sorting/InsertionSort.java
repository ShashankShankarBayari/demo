package com.shashank.demo.Algorithms.Sorting;

public class InsertionSort {

    // [7, 8, 5, 2, 4, 6, 3]
    public void sortArray(int[] inputArray) {
        int n = inputArray.length;

        for (int i = 1; i < n; i++) {
            int key = inputArray[i];
            int j = i - 1;

            while (j >= 0 && inputArray[j] > key) {
                inputArray[j + 1] = inputArray[j];
                j = j - 1;
            }
            inputArray[j + 1] = key;
        }
        for (int value : inputArray) {
            System.out.println(value + " ");
        }
    }
}
