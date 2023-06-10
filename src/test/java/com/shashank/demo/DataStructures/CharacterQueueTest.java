package com.shashank.demo.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterQueueTest {

    private CharacterQueue cut;

    @BeforeEach
    public void setUp() {
        cut = new CharacterQueue();
    }

    @Test
    void enQueueTest() {
        cut.enQueue('a');
        cut.enQueue('b');
        cut.enQueue('c');
        cut.enQueue('d');
        cut.printArrayQueue();
    }

    @Test
    void deQueueTest() {
        cut.enQueue('a');
        cut.enQueue('b');
        cut.enQueue('c');
        cut.enQueue('d');
        System.out.println("Dequeued element is:" + cut.deQueue());
        System.out.println("Dequeued element is:" + cut.deQueue());
        System.out.println("Dequeued element is:" + cut.deQueue());
        System.out.println("Dequeued element is:" + cut.deQueue());
        System.out.println("Dequeued element is:" + cut.deQueue());
        cut.printArrayQueue();
    }

    @Test
    void enQueueLinkedListTest() {
        cut.enqueueUsingLinkedList('a');
        cut.enqueueUsingLinkedList('b');
        cut.enqueueUsingLinkedList('c');
        cut.enqueueUsingLinkedList('d');
        cut.printLinkedListQueue();
        System.out.println("Dequeued element is:" + cut.dequeueUsingLinkedList());
        cut.printLinkedListQueue();
    }
}