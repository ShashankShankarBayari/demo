package com.shashank.demo.Algorithms.Searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    private BinarySearch cut;

    @BeforeEach
    void setup() {
        cut = new BinarySearch();
    }

    @Test
    void searchElement() {
        System.out.println(cut.searchElement(10, new int[]{1, 3, 4, 6, 8, 10}));
    }
}