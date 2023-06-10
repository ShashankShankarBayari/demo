package com.shashank.demo.Algorithms.LinkedLists;

public class RemoveDuplicatesFromList {

    public LinkedList removeDuplicates(LinkedList head) {
        if (head == null) {
            return null;
        }
        LinkedList current = head;
        while (current != null) {
            LinkedList next = current.next;
            if (current.value == next.value) {
                current.next = next.next;
                current = current.next;
            } else {
                current = next;
            }
        }
        return head;
    }
}

class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
        this.value = value;
        this.next = null;
    }

    public LinkedList() {

    }
}
