package com.shashank.demo.DataStructures;

public class Node {
    public Node() {

    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
    }

    public int data;
    public Node next;
}
