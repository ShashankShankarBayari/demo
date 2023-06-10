package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

public class ESortedSquaredArray {

    // [-7,-5,-4,3,6,8,9]
    // [49,25,16,9,36,64,81]

    public void squareIt(int[] inputArray) {
        int start = 0;
        int end = inputArray.length - 1;
        int[] outputArray = new int[inputArray.length];

        for (int i = outputArray.length - 1; i >= 0; i--) {
            if (Math.abs(inputArray[start]) > Math.abs(inputArray[end])) {
                outputArray[i] = inputArray[start] * inputArray[start];
                start++;
            } else {
                outputArray[i] = inputArray[end] * inputArray[end];
                end--;
            }
        }

        for (int element : outputArray) {
            System.out.println(element + " ");
        }

    }
}
