package com.shashank.demo.Algorithms.StringsAndArrays;

import com.shashank.demo.Algorithms.StringsAndArrays.HackerRank.JumpingClouds;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JumpingCloudsTest {
    private JumpingClouds cut;

    @BeforeEach
    void setup() {
        cut = new JumpingClouds();
    }

    @Test
    void findMinimumNumberOfJumps() {
        System.out.println(cut.findMinimumNumberOfJumps(Arrays.asList(0, 0, 1, 0, 0, 1, 0)));
    }
}