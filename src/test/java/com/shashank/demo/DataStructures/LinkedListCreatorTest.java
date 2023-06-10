package com.shashank.demo.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListCRUDTest {
    private LinkedListCRUD cut;

    @BeforeEach
    public void setUp() {
        cut = new LinkedListCRUD();
    }

    @Test
    public void testAdd() {
        cut.add(4);
        cut.add(5);
        cut.add(10);
        cut.show();
    }

    @Test
    public void testAddAll() {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(2, 8, 9));
        cut.addAll(dataList);
        cut.show();
    }

    @Test
    public void testInsertAt() {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(2, 8, 9, 10));
        cut.addAll(dataList);
        cut.insertAt(2, 4);
        cut.show();
    }

    @Test
    public void testDeleteAt() {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(2, 8, 9, 10));
        cut.addAll(dataList);
        cut.deleteAt(2);
        cut.show();
    }

    @Test
    public void testReverse() {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(2, 8, 9, 10));
        cut.addAll(dataList);
        cut.reverse();
        cut.show();
    }

    @Test
    public void testDuplicateRemoval() {
        List<Integer> dataList = new ArrayList<>(Arrays.asList(1, 1, 3, 4, 4, 4, 5, 6, 6));
        Node head = cut.addAll(dataList);
        cut.removeDuplicates(head);
        cut.show();
    }

    @Test
    public void testReversePrint() {
        Node head = cut.add(4);
        cut.add(5);
        cut.add(6);
        cut.add(7);
        cut.reversePrint(head);
    }

    @Test
    public void testRecursiveReverse() {
        Node head = cut.add(4);
        cut.add(5);
        cut.add(6);
        cut.add(7);
        cut.reverseRecursive(head);
        cut.show();
    }

    @Test
    public void testMerge2Lists() {
        Node head1 = cut.addAll(new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9)));
        LinkedListCRUD cut2 = new LinkedListCRUD();
        Node head2 = cut2.addAll(new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10)));
        Node result = cut.mergeLinkedLists(head1, head2);
    }

}