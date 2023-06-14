/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Construct the following tree
          1
        /   \
      2       3
    /      /    \
   4      5      6
        /   \
       7      8
 Output: 1, 3, 6
         2, 5, 8
         4, 7
*/
public class DiagonalPrintOfTree {
  Map<Integer, List<Integer>> map = new HashMap<>();

  public void print(DoublyNode root, int diagonal) {
    if (root == null) {
      return;
    }
    map.computeIfAbsent(diagonal, d -> new ArrayList<>()).add(root.data);
    print(root.left, diagonal + 1);
    print(root.right, diagonal);
  }
}
