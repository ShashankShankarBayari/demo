package com.shashank.demo.DataStructures;

public class NodeQueue {

    private DoublyNode[] queueArray = new DoublyNode[20];
    private int front = 0;
    private int rear = 0;

    public void enQueue(DoublyNode node) {
        if (rear > queueArray.length) {
            System.out.println("Queue is full");
        } else {
            queueArray[rear++] = node;
        }
    }

    public DoublyNode deQueue() {
        DoublyNode dequeuedElement = null;
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            dequeuedElement = queueArray[front];
            front++;
        }
        return dequeuedElement;
    }

    public boolean isEmpty() {
        if (front == rear) {
            return true;
        } else
            return false;
    }
}
