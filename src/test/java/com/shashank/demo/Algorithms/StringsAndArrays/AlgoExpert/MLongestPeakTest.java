package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

import org.junit.jupiter.api.Test;

class MLongestPeakTest {

    @Test
    void find() {
        MLongestPeak cut = new MLongestPeak();
        System.out.println(cut.find(new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3}));
    }
}