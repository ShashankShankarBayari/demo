/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;

public class InvertBinaryTree {

  public DoublyNode invert(DoublyNode root) {
    if (root == null) {
      return null;
    }
    invert(root.left);
    invert(root.right);
    DoublyNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    return root;
  }

  public void invertAlternativeLevelsOnly(DoublyNode left, DoublyNode right, int currentLevel) {
    if (left == null || right == null) {
      return;
    }

    invertAlternativeLevelsOnly(left.left, right.right, currentLevel + 1);
    invertAlternativeLevelsOnly(left.right, right.left, currentLevel + 1);

    if (currentLevel % 2 == 0) {
      int temp = left.data;
      left.data = right.data;
      right.data = temp;
    }
  }


}
