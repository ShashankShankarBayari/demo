package com.shashank.demo.Algorithms.Sorting;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

    @Test
    void sort() {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(new int[]{9, 2, 4, 10, 3, 7, 5});
    }
}