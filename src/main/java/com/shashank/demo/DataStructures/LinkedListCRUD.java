package com.shashank.demo.DataStructures;

import java.util.List;

public class LinkedListCRUD {

    private Node head = null;

    public Node add(int data) {
        if (head == null) {
            head = createNode(data, null);
        } else {
            Node lastNode = traverseToIndex(getSizeOfLinkedList(head));
            lastNode.next = createNode(data, null);
        }
        return head;
    }

    public Node addAll(List<Integer> dataList) {
        Node head = add(dataList.get(0));
        for (int i = 1; i < dataList.size(); i++) {
            add(dataList.get(i));
        }
        return head;
    }

    public void insertAt(int index, int data) {
        if ((head == null && index > 0) || index > getSizeOfLinkedList(head)) {
            System.out.println("Invalid index for the current linkedList");
        } else {
            if (index == 0) {
                head = createNode(data, head);
            } else {
                Node nodeAtIndex = traverseToIndex(index);
                nodeAtIndex.next = createNode(data, nodeAtIndex.next);
            }
        }
    }

    public void deleteAt(int index) {
        if ((head == null && index > 0) || index > getSizeOfLinkedList(head)) {
            System.out.println("Invalid index for the current linkedList");
        } else {
            if (index == 0) {
                head = head.next;
            } else {
                Node nodeAtIndex = traverseToIndex(index);
                nodeAtIndex.next = nodeAtIndex.next.next;
            }
        }
    }

    public Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        while (current.next != null) {
            Node next = current.next;
            if (current.data == next.data) {
                while (next != null && current.data == next.data) {
                    next = next.next;
                    current.next = next;
                }
            } else {
                current = next;
            }
        }
        return head;
    }

    public void reverse() {
        Node currentNode = head;
        Node nextNode;
        Node tempNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = tempNode;
            tempNode = currentNode;
            currentNode = nextNode;
        }
        head = tempNode;
    }

    public void reverseRecursive(Node currentNode) {
        if (currentNode.next == null) {
            head = currentNode;
            return;
        }
        reverseRecursive(currentNode.next);
        Node nextNode = currentNode.next;
        nextNode.next = currentNode;
        currentNode.next = null;
    }

    public void reversePrint(Node node) {
        if (node == null) {
            return;
        }
        reversePrint(node.next);
        System.out.println(node.data);
    }

    private Node traverseToIndex(int index) {
        Node currentNode = head;
        if ((head == null && index > 0) || index > getSizeOfLinkedList(head)) {
            System.out.println("Invalid index for the current linkedList");
        } else {
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
        }
        return currentNode;
    }

    private int getSizeOfLinkedList(Node head) {
        Node currentNode = head;
        int size = 1;
        while (currentNode.next != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public Node mergeLinkedLists(Node headOne, Node headTwo) {
        Node current1 = headOne;
        Node current2 = headTwo;
        Node previous2 = null;

        if (headOne == null) {
            return headTwo;
        }
        if (headTwo == null) {
            return headOne;
        }

        while (current1 != null && current2 != null) {
            if (current1.data > current2.data) {
                while (current2 != null && current1.data > current2.data) {
                    previous2 = current2;
                    current2 = current2.next;
                }
                previous2.next = current1;
                previous2 = current1;
            } else {
                if (previous2 == null) {
                    headTwo = current1;
                    previous2 = headTwo;
                } else {
                    previous2.next = current1;
                    previous2 = current1;
                }
            }

            current1 = current1.next;
            previous2.next = current2;
        }
        if (current1 != null) {
            previous2.next = current1;
        }
        return headTwo;
    }

    private Node createNode(int data, Node next) {
        Node node = new Node();
        node.data = data;
        node.next = next;
        return node;
    }

}