/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {

  public void printTreeInReverseLevelOrder(DoublyNode root) {
    Queue<DoublyNode> queue = new LinkedList<>();
    Stack<DoublyNode> stack = new Stack<>();

    queue.add(root);
    while (!queue.isEmpty()) {
      DoublyNode currentNode = queue.poll();
      if (currentNode.right != null) {
        queue.add(currentNode.right);
      }

      if (currentNode.left != null) {
        queue.add(currentNode.left);
      }
      stack.push(currentNode);
    }

    while (!stack.isEmpty()){
      System.out.println(stack.pop().data);
    }
  }
}
