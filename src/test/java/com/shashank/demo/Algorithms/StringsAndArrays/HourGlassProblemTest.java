package com.shashank.demo.Algorithms.StringsAndArrays;

import com.shashank.demo.Algorithms.StringsAndArrays.HackerRank.HourGlassProblem;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class HourGlassProblemTest {

    @Test
    void computeHighestSum() {
        HourGlassProblem cut = new HourGlassProblem();
        List<List<Integer>> input = Arrays.asList(Arrays.asList(1, 1, 1, 0, 0, 0), Arrays.asList(0, 1, 0, 0, 0, 0),
                Arrays.asList(1, 1, 1, 0, 0, 0), Arrays.asList(0, 0, 2, 4, 4, 0), Arrays.asList(0, 0, 0, 2, 0, 0),
                Arrays.asList(0, 0, 1, 2, 4, 0));
        System.out.println(cut.computeHighestSum(input));
    }

    @Test
    void computeHighestSumWithNegative() {
        HourGlassProblem cut = new HourGlassProblem();
        List<List<Integer>> input = Arrays.asList(Arrays.asList(-9, -9, -9, 1, 1, 1), Arrays.asList(0, -9, 0, 4, 3, 2),
                Arrays.asList(-9, -9, -9, 1, 2, 3), Arrays.asList(0, 0, 8, 6, 6, 0), Arrays.asList(0, 0, 0, -2, 0, 0),
                Arrays.asList(0, 0, 1, 2, 4, 0));
        System.out.println(cut.computeHighestSum(input));
    }
}