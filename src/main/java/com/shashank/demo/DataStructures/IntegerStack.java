package com.shashank.demo.DataStructures;


/*

// See this page for good Queue algorithms:
// https://medium.com/techie-delight/queue-data-structure-practice-problems-and-interview-questions-f459bf0578db

*/
//      0  1  2  3  4  5  6  7  8  9
//  0 [ 4  4  6  5  5  1  1  1  7  4 ]
//  1 [ 3  6  2  4  6  5  7  2  6  6 ]
//  2 [ 1  3  6  1  1  1  7  1  4  5 ]
//  3 [ 7  5  6  3  1  3  3  1  1  7 ]
//  4 [ 3  4  6  4  7  2  6  5  4  4 ]
//  5 [ 3  2  5  1  2  5  1  2  3  4 ]
//  6 [ 4  2  2  2  5  2  3  7  7  3 ]
//  7 [ 7  2  4  3  5  2  2  3  6  3 ]
//  8 [ 5  1  4  2  6  4  6  7  3  7 ]
//  9 [ 1  4  1  7  5  3  6  5  3  4 ]
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
