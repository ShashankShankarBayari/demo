package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

public class MSmallestDifference {
    // [-1,3,5,10,*20,28]
    // [*15,17,26,134,135]
    // S: 14
    // C: 21
    // N: 23

    public int[] findSmallest(int[] arrayOne, int[] arrayTwo) {
        int pointer1 = 0, pointer2 = 0;
        int smallestDifference = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];

        while (pointer1 < arrayOne.length - 1 && pointer2 < arrayTwo.length - 1) {
            int firstNumber = arrayOne[pointer1];
            int secondNumber = arrayTwo[pointer2];
            int currentDifference = Math.abs(firstNumber - secondNumber);
            if (firstNumber < secondNumber) {
                pointer1++;
            } else if (firstNumber > secondNumber) {
                pointer2++;
            } else {
                return new int[]{arrayOne[pointer1], arrayTwo[pointer2]};
            }
            if (currentDifference < smallestDifference) {
                smallestDifference = currentDifference;
                smallestPair = new int[]{firstNumber, secondNumber};
            }
        }
        return smallestPair;

    }

}
