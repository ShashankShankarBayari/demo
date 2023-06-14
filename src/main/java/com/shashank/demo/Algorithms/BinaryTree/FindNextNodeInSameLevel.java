/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;

public class FindNextNodeInSameLevel {
  int foundAt = 0;
  boolean found = false;

  public Integer find(DoublyNode root, int nodeValue, int level) {
    if (root == null) {
      return null;
    }
    if (!found && root.data == nodeValue) {
      found = true;
      foundAt = level;
    } else if (found && level == foundAt) {
      return root.data;
    }
    Integer val;
    val = find(root.left, nodeValue, level + 1);
    if (val != null) {
      return val;
    }
    val = find(root.right, nodeValue, level + 1);
    if (val != null) {
      return val;
    }
    return null;
  }
}
