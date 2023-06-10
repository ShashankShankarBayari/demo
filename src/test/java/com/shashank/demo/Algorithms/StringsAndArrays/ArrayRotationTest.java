package com.shashank.demo.Algorithms.StringsAndArrays;

import com.shashank.demo.Algorithms.StringsAndArrays.HackerRank.ArrayRotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class ArrayRotationTest {

    @Test
    void rotateLeft() {
        ArrayRotation cut = new ArrayRotation();
        List<Integer> output = cut.rotateLeft(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 4);
        output.forEach(element -> System.out.println(element));
    }
}