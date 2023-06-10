/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;;
import java.util.Stack;

public class FindAncestorsOfANode {

  public void findAncestors(DoublyNode root, Stack<Integer> stack, int searchValue) {
    if (root == null) {
      return;
    }

    if (root.data == searchValue) {
      StringBuilder stringBuilder = new StringBuilder();
      while (!stack.isEmpty()) {
        stringBuilder.append(stack.pop());
        stringBuilder.append(',');
      }
      System.out.println("The ancestors of node " + searchValue + ": " + stringBuilder);
      return;
    }
    stack.push(root.data);
    findAncestors(root.left, stack, searchValue);
    findAncestors(root.right, stack, searchValue);
    if (!stack.isEmpty()) {
      stack.pop();
    }
  }
}
