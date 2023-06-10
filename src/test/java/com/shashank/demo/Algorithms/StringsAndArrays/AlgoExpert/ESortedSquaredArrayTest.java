package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ESortedSquaredArrayTest {
    private ESortedSquaredArray cut;

    @BeforeEach
    void setup() {
        cut = new ESortedSquaredArray();
    }

    @Test
    void squareIt() {
        cut.squareIt(new int[]{-7, -5, -4, 3, 6, 8, 9});
    }
}