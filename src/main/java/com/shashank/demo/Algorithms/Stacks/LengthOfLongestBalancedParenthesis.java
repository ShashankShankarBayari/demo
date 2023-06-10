/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.Stacks;

import java.util.Stack;

public class LengthOfLongestBalancedParenthesis {
  // Example: (()())(()
  public int findLength(String input) {
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);
    int maxLength = 0;
    char[] charArray = input.toCharArray();

    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] == '(') {
        stack.push(i);
      } else if (charArray[i] == ')') {
        stack.pop();
        if (stack.isEmpty()) {
          stack.push(i);
        }
        maxLength = Math.max(maxLength, (i - stack.peek()));
      }
    }
    return maxLength;
  }
}
