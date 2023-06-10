package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import java.util.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAncestorsOfADoublyNodeTest {

  private FindAncestorsOfANode cut;

  @BeforeEach
  void setup() {
    cut = new FindAncestorsOfANode();
  }

  @Test
  void findAncestors() {
    DoublyNode root = new DoublyNode(1);
    root.left = new DoublyNode(2);
    root.right = new DoublyNode(3);
    root.left.left = new DoublyNode(4);
    root.left.right = new DoublyNode(5);
    root.right.left = new DoublyNode(6);
    root.right.right = new DoublyNode(7);
    root.right.left.left = new DoublyNode(8);
    root.right.right.right = new DoublyNode(9);

    cut.findAncestors(root, new Stack<>(), 7);
  }
}