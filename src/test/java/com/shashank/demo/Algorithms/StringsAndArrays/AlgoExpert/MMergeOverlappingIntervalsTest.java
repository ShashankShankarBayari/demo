package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

import org.junit.jupiter.api.Test;

class MMergeOverlappingIntervalsTest {

    @Test
    void merge() {
        MMergeOverlappingIntervals cut = new MMergeOverlappingIntervals();
        cut.merge(new int[][]{{1, 2}, {3, 5}, {9, 10}, {6, 8}, {4, 7}});
    }
}