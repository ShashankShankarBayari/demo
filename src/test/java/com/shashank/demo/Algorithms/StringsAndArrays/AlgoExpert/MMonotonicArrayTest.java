package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MMonotonicArrayTest {
    private MMonotonicArray cut;

    @BeforeEach
    void setup() {
        cut = new MMonotonicArray();
    }

    @Test
    void isMonotonic() {
        cut.isMonotonic(new int[]{-1, -1, -1, -1, -1});
    }
}