package com.shashank.demo.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterStackTest {

    private CharacterStack cut;

    @BeforeEach
    public void setUp() {
        cut = new CharacterStack();
    }

    @Test
    void pushUsingArray() {
        cut.push('a');
        cut.push('b');
        cut.push('c');
        cut.push('d');
        cut.push('e');
        cut.printArrayStack();
    }

    @Test
    void popUsingArray() {
        cut.push('a');
        cut.push('b');
        cut.push('c');
        cut.push('d');
        cut.printArrayStack();
        System.out.println("Popped element is:" + cut.pop());
    }

    @Test
    void pushUsingLinkedList() {
        cut.pushUsingLinkedList(1);
        cut.pushUsingLinkedList(2);
        cut.pushUsingLinkedList(3);
        cut.pushUsingLinkedList(4);
        cut.pushUsingLinkedList(5);
        cut.printLinkedListStack();
    }

    @Test
    public void popUsingLinkedList() {
        cut.pushUsingLinkedList(1);
        cut.pushUsingLinkedList(2);
        cut.pushUsingLinkedList(3);
        cut.pushUsingLinkedList(4);
        cut.pushUsingLinkedList(5);
        cut.popUsingLinkedList();
        cut.popUsingLinkedList();
    }
}