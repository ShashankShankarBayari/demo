package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

public class MArrayOfProducts {

    // [5,1,4,2]
    public int[] compute(int[] array) {
        int left, right, currentProduct;
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            currentProduct = 1;
            if (i > 0) {
                left = i - 1;
                while (left >= 0) {
                    currentProduct = currentProduct * array[left];
                    left--;
                }
            }
            if (i < array.length - 1) {
                right = i + 1;
                while (right < array.length) {
                    currentProduct = currentProduct * array[right];
                    right++;
                }
            }
            output[i] = currentProduct;
        }
        return output;
    }
}
