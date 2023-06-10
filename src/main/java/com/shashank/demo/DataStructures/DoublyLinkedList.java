package com.shashank.demo.DataStructures;

import java.util.List;
import java.util.Objects;

public class DoublyLinkedList {
    private DoublyNode head;

    public void create(int data) {
        if (Objects.isNull(head)) {
            head = createNewNode(data, null, null);
        } else {
            DoublyNode lastNode = traverseTillNode(getSizeOfDoublyLinkedList());
            lastNode.right = createNewNode(data, lastNode, null);
        }
    }

    public void createAll(List<Integer> dataList) {
        for (Integer data : dataList) {
            create(data);
        }
    }

    public void insertAt(int index, int data) {
        DoublyNode newNode;
        if (index == 0) {
            newNode = createNewNode(data, null, head);
            head.left = newNode;
            head = newNode;
        } else {
            DoublyNode insertPointNode = traverseTillNode(index - 1);
            newNode = createNewNode(data, insertPointNode, insertPointNode.right);
            insertPointNode.right = newNode;
        }
    }

    public void deleteAt(int index) {
        if ((head == null && index > 0) || index > getSizeOfDoublyLinkedList()) {
            System.out.println("Invalid index for the current linkedList");
        } else {
            if (index == 0) {
                head = head.right;
                head.right.left = null;
            } else if (index == getSizeOfDoublyLinkedList()) {
                DoublyNode doublyNodeAtDeletionIndex = traverseTillNode(index - 1);
                doublyNodeAtDeletionIndex.right = null;
            } else {
                DoublyNode doublyNodeAtDeletionIndex = traverseTillNode(index - 1);
                doublyNodeAtDeletionIndex.right = doublyNodeAtDeletionIndex.right.right;
            }
        }
    }

    public void reverse() {
        DoublyNode currentNode = head;
        DoublyNode nextNode;

        while (currentNode != null) {
            nextNode = currentNode.right;
            currentNode.right = currentNode.left;
            currentNode.left = nextNode;
            head = currentNode;
            currentNode = nextNode;

        }
    }

    public void show() {
        DoublyNode currentNode = head;
        while (currentNode.right != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.right;
        }
        System.out.println(currentNode.data);
    }

    private DoublyNode traverseTillNode(int index) {
        DoublyNode nodeAtIndex = head;
        if ((head == null && index > 0) || index > getSizeOfDoublyLinkedList()) {
            System.out.println("Invalid index for the current linkedList");
        } else {
            for (int i = 0; i < index; i++) {
                nodeAtIndex = nodeAtIndex.right;
            }
        }
        return nodeAtIndex;
    }

    private int getSizeOfDoublyLinkedList() {
        int size = 0;
        DoublyNode doublyNode = head;
        while (doublyNode.right != null) {
            size++;
            doublyNode = doublyNode.right;
        }
        return size;
    }

    private DoublyNode createNewNode(int data, DoublyNode left, DoublyNode right) {
        DoublyNode doublyNode = new DoublyNode();
        doublyNode.data = data;
        doublyNode.left = left;
        doublyNode.right = right;
        return doublyNode;
    }
}

