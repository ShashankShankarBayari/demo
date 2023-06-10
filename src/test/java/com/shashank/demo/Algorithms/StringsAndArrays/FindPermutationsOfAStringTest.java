package com.shashank.demo.Algorithms.StringsAndArrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindPermutationsOfAStringTest {

    private FindPermutationsOfAString cut;

    @BeforeEach
    void setUp() {
        cut = new FindPermutationsOfAString();
    }

    @Test
    void compute() {
        cut.compute("abc", "");
    }
}