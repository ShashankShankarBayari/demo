package com.shashank.demo.Algorithms.Sorting;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

    @Test
    void sortArray() {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortArray(new int[]{9, 2, 4, 10, 3, 7, 5});
    }
}