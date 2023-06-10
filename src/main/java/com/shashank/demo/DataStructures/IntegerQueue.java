package com.shashank.demo.DataStructures;

public class IntegerQueue {
    private int[] queueArray = new int[10];
    private int front = 0;
    private int rear = 0;
    private Node head = null;
    private Node tail = null;

    public void enQueue(int data) {
        if (rear > queueArray.length) {
            System.out.println("Queue is full");
        } else {
            queueArray[rear++] = data;
        }
    }

    public void enQueueToCircularQueue(int data) {
        if ((rear + 1) % queueArray.length == front) {
            System.out.println("Queue is full");
        } else {
            queueArray[rear] = data;
            rear = (rear + 1) % queueArray.length;
        }
    }

    public Integer deQueue() {
        Integer dequeuedElement = null;
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            dequeuedElement = queueArray[front];
            front++;
        }
        return dequeuedElement;
    }

    public void enqueueUsingLinkedList(char data) {
        Node newElement = createNewElement(data);
        if (head == null) {
            head = newElement;
            tail = head;
        } else {
            tail.next = newElement;
            tail = newElement;
        }
    }

    public char dequeueUsingLinkedList() {
        char element = '\0';
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            element = (char) head.data;
            head = head.next;
        }
        return element;
    }

    public void printLinkedListQueue() {
        Node currentElement = head;
        while (currentElement != null) {
            System.out.println((char) currentElement.data);
            currentElement = currentElement.next;
        }
    }

    public boolean isEmpty() {
        if (front == 0 && rear == 0) {
            return true;
        } else
            return false;
    }

    private Node createNewElement(char data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        return newNode;
    }

    public void printArrayQueue() {
        for (int element : queueArray) {
            System.out.println(element);
        }
        System.out.println("Front:" + front);
        System.out.println("Rear:" + rear);
    }

}
