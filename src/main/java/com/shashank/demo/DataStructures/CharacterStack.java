package com.shashank.demo.DataStructures;

public class CharacterStack {

    private char[] stackCharArray = new char[5];
    private int top = -1;
    private Node head = null;

    public CharacterStack() {
    }

    public void push(char data) {
        if (top >= stackCharArray.length) {
            System.out.println("Stack is full");
        } else {
            stackCharArray[++top] = data;
        }
    }

    public Character pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return null;
        } else {
            Character element = stackCharArray[top--];
            return element;
        }
    }

    public Character getTop() {
        if (top == -1) {
            return null;
        } else {
            return stackCharArray[top];
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
        for (Character element : stackCharArray) {
            System.out.println(element);
        }
    }
}
