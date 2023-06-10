package com.shashank.demo.Algorithms.BinarySearchTrees;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ConstructBSTFromPreOderArrayTest {

    private ConstructBSTFromPreOderArray cut;

    @Test
    void constructBST() {
        cut = new ConstructBSTFromPreOderArray();
        cut.constructBST(new ArrayList<>(Arrays.asList(10, 4, 2, 1, 5, 17, 19, 18)));
    }
}