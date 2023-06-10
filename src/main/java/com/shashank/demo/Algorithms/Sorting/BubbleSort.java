package com.shashank.demo.Algorithms.Sorting;

public class BubbleSort {

    public void sortArray(int[] input) {
        int lengthOfArray = input.length;

        for (int i = 0; i < lengthOfArray; i++) {
            for (int j = 0; j < (lengthOfArray - i) - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        for (int value : input) {
            System.out.println(value + " ");
        }
    }
}
