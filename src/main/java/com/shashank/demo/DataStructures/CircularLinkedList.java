package com.shashank.demo.DataStructures;

import java.util.List;

public class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

    public void create(int data) {
        if (head == null) {
            head = createNewNode(data);
            tail = head;
        } else {
            Node newNode = createNewNode(data);
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void createAll(List<Integer> dataList) {
        for (Integer data : dataList) {
            create(data);
        }
    }

    public boolean containNode(int searchValue) {
        Node currentNode = head;
        while (currentNode.next != head) {
            if (currentNode.data == searchValue) {
                return true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            Node newNode = createNewNode(data);
            newNode.next = head;
            head = newNode;
            tail.next = head;
        } else {
            Node nodeAtIndex = traverseToIndex(index - 1);
            Node newNode = createNewNode(data);
            newNode.next = nodeAtIndex.next;
            nodeAtIndex.next = newNode;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            tail.next = head.next;
            head = tail.next;
        } else {
            Node nodeAtIndex = traverseToIndex(index - 1);
            if (nodeAtIndex == null) {
                System.out.println("Out of bounds index has been specified");
            } else {
                if (nodeAtIndex.next == tail) {
                    nodeAtIndex.next = head;
                    tail = nodeAtIndex;
                } else {
                    nodeAtIndex.next = nodeAtIndex.next.next;
                }
            }
        }
    }

    public void reverse() {
        Node previousNode = tail;
        Node currentNode = head;
        Node nextNode;
        do {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        } while (currentNode != head);

        swapHeadAndTail();

    }

    private void swapHeadAndTail() {
        Node tempNode;
        tempNode = head;
        head = tail;
        tail = tempNode;
    }

    public void show() {
        Node startPoint = head;
        while (startPoint.next != head) {
            System.out.println(startPoint.data);
            startPoint = startPoint.next;
        }
        System.out.println(startPoint.data);
    }

    private Node traverseToIndex(int index) {
        Node currentNode = head;
        if (index == 0) {
            return head;
        } else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
                if (currentNode.next == head) {
                    System.out.println("Out of bounds index has been specified");
                    return null;
                }
            }
            return currentNode;
        }
    }

    private Node createNewNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
    }

}


