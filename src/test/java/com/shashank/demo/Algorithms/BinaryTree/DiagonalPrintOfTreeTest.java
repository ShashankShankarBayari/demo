package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalPrintOfTreeTest {

  @Test
  void print() {
    DiagonalPrintOfTree cut = new DiagonalPrintOfTree();
    DoublyNode root = new DoublyNode(1);
    root.left = new DoublyNode(2);
    root.right = new DoublyNode(3);
    root.left.left = new DoublyNode(4);
    root.right.left = new DoublyNode(5);
    root.right.right = new DoublyNode(6);
    root.right.left.left = new DoublyNode(7);
    root.right.left.right = new DoublyNode(8);
    cut.print(root, 0);
    cut.map.forEach((k, v) -> {
      v.forEach(element -> System.out.println(element));
      System.out.println();
    });
  }
}