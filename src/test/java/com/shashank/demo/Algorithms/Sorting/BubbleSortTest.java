package com.shashank.demo.Algorithms.Sorting;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void sortArray() {
        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.sortArray(new int[]{9, 2, 4, 10, 3, 7, 5});
    }
}