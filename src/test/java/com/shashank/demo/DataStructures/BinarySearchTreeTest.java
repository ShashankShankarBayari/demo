package com.shashank.demo.DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    private BinarySearchTree cut;
    private DoublyNode root;

    @BeforeEach
    public void setUp() {
          /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        cut = new BinarySearchTree();
        root = cut.insertNodeIterative(50);
        cut.insertNodeIterative(30);
        cut.insertNodeIterative(20);
        cut.insertNodeIterative(40);
        cut.insertNodeIterative(70);
        cut.insertNodeIterative(60);
        cut.insertNodeIterative(80);
    }

    @Test
    void insertNodeIntoBST() {
    }

    @Test
    void insertNodeIterative() {
        cut.Inorder(root);
        cut.preOrder(root);
    }

    @Test
    void searchInTreeTest() {
        System.out.println(cut.searchTreeForValue(30, root));
        System.out.println(cut.searchValueRecurssive(root, 30));
        System.out.println(cut.searchValueRecurssive(root, 300));
        System.out.println(cut.searchTreeForValue(300, root));
    }

    @Test
    void maxValueInTreeTest() {
        System.out.println(cut.findMaximumValueInBST());
    }

    @Test
    void minValueInTreeTest() {
        System.out.println(cut.findMinimumValueInBST(root));
    }

    @Test
    void heightOfTreeTest() {
        System.out.println(cut.findHeightOfBST(root));
        // System.out.println(cut.findHeightOfBST(root.right));
    }

    @Test
    void BFSInTreeTest() {
        cut.breadthFirstPrint(root);
    }

    @Test
    void IsTreeABinarySearchTreeTest() {
        System.out.println(cut.isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void deleteNodeInBinarySearchTreeTest() {
        cut.deleteNodeInBST(root, 30);
        cut.Inorder(root);
    }
}