package com.shashank.demo.Algorithms.StringsAndArrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Find3IndicesThatAddUpToZeroTest {
    private Find3IndicesThatAddUpToZero cut;

    @BeforeEach
    void setUp() {
        cut = new Find3IndicesThatAddUpToZero();
    }

    @Test
    void compute() {
        cut.compute(new int[]{-1, 0, 1, 2, -1, -4});
    }
}