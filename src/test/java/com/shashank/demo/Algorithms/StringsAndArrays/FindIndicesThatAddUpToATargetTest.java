package com.shashank.demo.Algorithms.StringsAndArrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindIndicesThatAddUpToATargetTest {

    private Find2IndicesThatAddUpToATarget cut;

    @BeforeEach
    void setUp() {
        cut = new Find2IndicesThatAddUpToATarget();
    }

    @Test
    void compute() {
        int[] output = cut.compute(new int[]{1, 2, 3, 4, 5, 6}, 10);
        for (int element : output) {
            System.out.println(element + " ");
        }
    }
}