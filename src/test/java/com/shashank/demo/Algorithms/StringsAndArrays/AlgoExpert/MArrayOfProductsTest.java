package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

import org.junit.jupiter.api.Test;

class MArrayOfProductsTest {

    @Test
    void compute() {
        MArrayOfProducts cut = new MArrayOfProducts();
        int[] output = cut.compute(new int[]{5, 1, 4, 2});
        for (int element : output) {
            System.out.println(element + " ");
        }
    }
}