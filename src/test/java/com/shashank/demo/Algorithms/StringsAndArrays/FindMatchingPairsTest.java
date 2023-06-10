package com.shashank.demo.Algorithms.StringsAndArrays;

import com.shashank.demo.Algorithms.StringsAndArrays.HackerRank.FindMatchingPairs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindMatchingPairsTest {

    private FindMatchingPairs cut;

    @BeforeEach
    void setup() {
        cut = new FindMatchingPairs();
    }

    @Test
    void find() {
        System.out.println(cut.find(new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20, 20}));
    }
}