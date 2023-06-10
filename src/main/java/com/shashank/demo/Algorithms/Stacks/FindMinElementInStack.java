/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.Stacks;

import java.util.Stack;

// Using secondary stack
public class FindMinElementInStack {

  Stack<Integer> main = new Stack<>();
  Stack<Integer> second = new Stack<>();

  public int findMinElementInStack() {
    return second.peek();
  }

  public void push(int element) {
    main.push(element);
    if (second.isEmpty() || second.peek() > element) {
      second.push(element);
    }
  }

  public void pop() {
    int element = main.pop();
    if (!second.isEmpty() && second.peek() == element) {
      second.pop();
    }
  }
}
