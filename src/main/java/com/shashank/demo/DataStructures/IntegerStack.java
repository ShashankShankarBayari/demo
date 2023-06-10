package com.shashank.demo.DataStructures;

public class IntegerStack {

    private int[] stackIntArray = new int[10];
    private int top = -1;
    private Node head = null;

    public IntegerStack() {
    }

    public void push(int data) {
        if (top >= stackIntArray.length) {
            System.out.println("Stack is full");
        } else {
            stackIntArray[++top] = data;
        }
    }

    public Integer pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            Integer element = stackIntArray[top--];
            return element;
        }
    }

    public Integer getTop() {
        if (top == -1) {
            return null;
        } else {
            return stackIntArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    public void pushUsingLinkedList(int data) {
        Node newNode = createNewNode(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void popUsingLinkedList() {
        System.out.println("Popped element is:" + head.data);
        head = head.next;
    }

    public void printLinkedListStack() {
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

    private Node createNewNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
    }

    public void printArrayStack() {
        for (Integer element : stackIntArray) {
            System.out.println(element);
        }
    }
}
