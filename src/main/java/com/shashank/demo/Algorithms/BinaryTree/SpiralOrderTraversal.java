/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
                1
            2       3
          4   5   6   7

  // Output should be: 1,2,3,7,6,5,4 or 1,3,2,4,5,6,7
 */
public class SpiralOrderTraversal {
  Map<Integer, Deque<Integer>> hashMap = new HashMap<>();

  public String getSpiralOrder(DoublyNode root) {
    treeUtil(root, hashMap, 0);
    StringBuilder string = new StringBuilder();
    hashMap.forEach((key, value) -> {
      value.forEach(element -> string.append(element));
    });
    return string.toString();
  }

  private void treeUtil(DoublyNode root, Map<Integer, Deque<Integer>> hashMap, int level) {
    if (root == null) {
      return;
    }
    Deque<Integer> deque = hashMap.computeIfAbsent(level, l -> new ArrayDeque<>());
    if (level % 2 == 0) {
      deque.addFirst(root.data);
    } else {
      deque.addLast(root.data);
    }
    treeUtil(root.left, hashMap, level + 1);
    treeUtil(root.right, hashMap, level + 1);
  }

}
