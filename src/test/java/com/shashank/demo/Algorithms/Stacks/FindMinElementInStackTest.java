package com.shashank.demo.Algorithms.Stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinElementInStackTest {

  private FindMinElementInStack cut;

  @BeforeEach
  public void setup() {
    cut = new FindMinElementInStack();
  }

  @Test
  void findMinElementInStack() {
    cut.push(6);
    System.out.println(cut.findMinElementInStack());

    cut.push(7);
    System.out.println(cut.findMinElementInStack());

    cut.push(8);
    System.out.println(cut.findMinElementInStack());

    cut.push(5);
    System.out.println(cut.findMinElementInStack());

    cut.push(3);
    System.out.println(cut.findMinElementInStack());

    cut.pop();
    System.out.println(cut.findMinElementInStack());

    cut.push(10);
    System.out.println(cut.findMinElementInStack());

    cut.pop();
    System.out.println(cut.findMinElementInStack());

    cut.pop();
    System.out.println(cut.findMinElementInStack());
  }
}