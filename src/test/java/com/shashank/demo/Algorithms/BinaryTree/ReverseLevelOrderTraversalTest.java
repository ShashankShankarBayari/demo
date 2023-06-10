package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLevelOrderTraversalTest {

  private ReverseLevelOrderTraversal cut;

  @Test
  void printTreeInReverseLevelOrder() {
    cut = new ReverseLevelOrderTraversal();
    DoublyNode root = new DoublyNode(15);
    root.left = new DoublyNode(10);
    root.right = new DoublyNode(20);
    root.left.left = new DoublyNode(8);
    root.left.right = new DoublyNode(12);
    root.right.left = new DoublyNode(16);
    root.right.right = new DoublyNode(25);

    cut.printTreeInReverseLevelOrder(root);
  }
}