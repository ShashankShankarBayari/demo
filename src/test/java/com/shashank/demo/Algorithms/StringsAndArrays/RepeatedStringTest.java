package com.shashank.demo.Algorithms.StringsAndArrays;

import com.shashank.demo.Algorithms.StringsAndArrays.HackerRank.RepeatedString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RepeatedStringTest {

    private RepeatedString cut;

    @BeforeEach
    void setup() {
        cut = new RepeatedString();
    }

    @Test
    void findCount() {
        System.out.println(cut.findCount("a", 100000000001L));
    }
}