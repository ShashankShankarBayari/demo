package com.shashank.demo.DataStructures;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CircularLinkedListTest {

    private CircularLinkedList cut;
    private List<Integer> dataList = Arrays.asList(1, 2, 3, 4, 5);

    @BeforeEach
    void setUp() {
        cut = new CircularLinkedList();
    }

    @Test
    void create() {
        cut.create(1);
        cut.create(2);
        cut.create(3);
        cut.create(4);
        cut.create(5);
        cut.show();
    }

    @Test
    void createAllTest() {
        cut.createAll(dataList);
        cut.show();
    }

    @Test
    void containsValueTest() {
        cut.createAll(dataList);
        Assertions.assertEquals(cut.containNode(1), true);
        Assertions.assertEquals(cut.containNode(10), false);
    }

    @Test
    void insertAtTest() {
        cut.createAll(dataList);
        cut.insertAt(2, 10);
        cut.show();
    }

    @Test
    void deleteAtTest() {
        cut.createAll(dataList);
        cut.deleteAt(4);
        cut.show();
    }

    @Test
    void reverseTest() {
        cut.createAll(dataList);
        cut.reverse();
        cut.show();
    }
}