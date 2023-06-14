/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import java.util.HashMap;
import java.util.Map;

public class LeftViewOfBinaryTree {
  public Map<Integer, Integer> map = new HashMap<>();

  public void findLeftView(DoublyNode root, int level) {
    if (root == null) {
      return;
    }
    map.putIfAbsent(level, root.data);
    findLeftView(root.left, level + 1);
    findLeftView(root.right, level + 1);
  }
}
