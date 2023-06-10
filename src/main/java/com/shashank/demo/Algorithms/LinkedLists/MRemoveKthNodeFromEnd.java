package com.shashank.demo.Algorithms.LinkedLists;

import com.shashank.demo.DataStructures.Node;

public class MRemoveKthNodeFromEnd {

    public void removeKthElement(Node head, int k) {
        int next = 0, previous = 0;
        Node currentNode = head, nextNode = head;

        if (head == null) {
            return;
        }

        while (next <= k && nextNode != null) {
            nextNode = nextNode.next;
            next++;
        }

        while (nextNode != null) {
            nextNode = nextNode.next;
            currentNode = currentNode.next;
        }

        currentNode.next = currentNode.next.next;
    }

}
