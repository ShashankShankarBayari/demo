package com.shashank.demo.DataStructures;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

    private DoublyLinkedList cut;

    @BeforeEach
    public void setUp() {
        cut = new DoublyLinkedList();
    }

    @Test
    void createTest() {
        cut.create(1);
        cut.create(2);
        cut.create(3);
        cut.create(4);
        cut.create(5);
        cut.show();
    }

    @Test
    public void createAllTest() {
        List<Integer> dataList = Arrays.asList(1, 2, 3, 4, 5);
        cut.createAll(dataList);
        cut.show();
    }

    @Test
    public void insertAtTest() {
        List<Integer> dataList = Arrays.asList(1, 2, 3, 4, 5);
        cut.createAll(dataList);
        cut.insertAt(2, 10);
        cut.show();
    }

    @Test
    public void deleteAtTest() {
        List<Integer> dataList = Arrays.asList(1, 2, 3, 4, 5);
        cut.createAll(dataList);
        cut.deleteAt(2);
        cut.show();
    }

    @Test
    public void reverseTest() {
        List<Integer> dataList = Arrays.asList(1, 2, 3, 4, 5);
        cut.createAll(dataList);
        cut.reverse();
        cut.show();
    }
}