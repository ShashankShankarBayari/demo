package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNextDoublyNodeInSameLevelTest {

  @Test
  void find() {
    FindNextNodeInSameLevel cut = new FindNextNodeInSameLevel();

    DoublyNode root = new DoublyNode(1);
    root.left = new DoublyNode(2);
    root.right = new DoublyNode(3);
    root.left.left = new DoublyNode(4);
    root.left.right = new DoublyNode(5);
    root.right.left = new DoublyNode(6);
    root.right.left.left = new DoublyNode(7);
    root.right.left.right = new DoublyNode(8);

    System.out.println(cut.find(root, 7, 0));
  }
}