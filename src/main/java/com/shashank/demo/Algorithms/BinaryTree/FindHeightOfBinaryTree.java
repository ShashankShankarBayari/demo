/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;

public class FindHeightOfBinaryTree {

  public int maxHeight = 0;

  public void findHeight(DoublyNode root, int currentHeight) {
    if (root == null) {
      return;
    }

    findHeight(root.left, currentHeight + 1);
    maxHeight = Math.max(currentHeight, maxHeight);
    findHeight(root.left, currentHeight + 1);
  }
}
