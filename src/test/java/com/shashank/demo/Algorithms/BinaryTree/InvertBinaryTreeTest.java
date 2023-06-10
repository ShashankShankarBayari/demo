package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {

  private InvertBinaryTree cut;

  @BeforeEach
  void setup() {
    cut = new InvertBinaryTree();
  }

  @Test
  void invert() {
    InvertBinaryTree cut = new InvertBinaryTree();
    DoublyNode root = new DoublyNode(1);
    root.left = new DoublyNode(2);
    root.right = new DoublyNode(3);
    root.left.left = new DoublyNode(4);
    root.left.right = new DoublyNode(5);
    root.right.left = new DoublyNode(6);
    root.right.right = new DoublyNode(7);

    root = cut.invert(root);
    printTree(root);
  }

  @Test
  void invertAlternate() {
            /* Construct the following tree
                    1
                  /   \
                /       \
              2           3
            /   \       /   \
           4     5     6     7
          / \   / \   / \   / \
         8   9 10 11 12 13 14 15
        */
    DoublyNode root = new DoublyNode(1);
    root.left = new DoublyNode(2);
    root.right = new DoublyNode(3);
    root.left.left = new DoublyNode(4);
    root.left.right = new DoublyNode(5);
    root.right.left = new DoublyNode(6);
    root.right.right = new DoublyNode(7);
    root.left.left.left = new DoublyNode(8);
    root.left.left.right = new DoublyNode(9);
    root.left.right.left = new DoublyNode(10);
    root.left.right.right = new DoublyNode(11);
    root.right.left.left = new DoublyNode(12);
    root.right.left.right = new DoublyNode(13);
    root.right.right.left = new DoublyNode(14);
    root.right.right.right = new DoublyNode(15);

    cut.invertAlternativeLevelsOnly(root.left, root.right, 2);
    printTree(root);
  }

  private void printTree(DoublyNode root) {
    Queue<DoublyNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      DoublyNode current = queue.poll();
      System.out.println(current.data);
      if (current.left != null) {
        queue.add(current.left);
      }
      if (current.right != null) {
        queue.add(current.right);
      }
    }
  }
}