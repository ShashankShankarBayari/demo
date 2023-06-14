package com.shashank.demo.Algorithms.BinaryTree;

import com.shashank.demo.DataStructures.DoublyNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralOrderTraversalTest {

  @Test
  void getSpiralOrder() {
    /*
                1
            2       3
          4   5   6   7

  // Output should be: 1,2,3,7,6,5,4 or 1,3,2,4,5,6,7
 */
    SpiralOrderTraversal cut = new SpiralOrderTraversal();
    DoublyNode root = new DoublyNode(1);
    root.left = new DoublyNode(2);
    root.right = new DoublyNode(3);
    root.left.left = new DoublyNode(4);
    root.left.right = new DoublyNode(5);
    root.right.left = new DoublyNode(6);
    root.right.right = new DoublyNode(7);
    assertEquals("1237654", cut.getSpiralOrder(root));
  }
}