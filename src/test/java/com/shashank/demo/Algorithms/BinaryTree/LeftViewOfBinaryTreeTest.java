package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftViewOfBinaryTreeTest {

  @Test
  void findLeftView() {
    LeftViewOfBinaryTree cut = new LeftViewOfBinaryTree();
    DoublyNode root = new DoublyNode(1);
    root.left = new DoublyNode(2);
    root.right = new DoublyNode(3);
    root.left.right = new DoublyNode(4);
    root.right.left = new DoublyNode(5);
    root.right.right = new DoublyNode(6);
    root.right.left.left = new DoublyNode(7);
    root.right.left.right = new DoublyNode(8);

    cut.findLeftView(root, 0);
    cut.map.forEach((k, v) -> System.out.println(v));
  }
}