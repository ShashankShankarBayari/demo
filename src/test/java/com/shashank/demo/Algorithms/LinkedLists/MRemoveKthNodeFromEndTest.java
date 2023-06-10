package com.shashank.demo.Algorithms.LinkedLists;

import com.shashank.demo.DataStructures.LinkedListCRUD;
import com.shashank.demo.DataStructures.Node;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class MRemoveKthNodeFromEndTest {

    private MRemoveKthNodeFromEnd cut;
    private LinkedListCRUD linkedList;

    @Test
    void removeKthElement() {
        linkedList = new LinkedListCRUD();
        Node head = linkedList.addAll(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)));
        cut = new MRemoveKthNodeFromEnd();
        cut.removeKthElement(head, 9);
    }
}