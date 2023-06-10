package com.shashank.demo.Algorithms.BinarySearchTrees;

public class KthLargestValueInBST {

    public int findValue(BST root, int k) {
        if (root == null) {
            k -= 1;
        }
        int currentValue = findValue(root.right, k);
        if (k == 0) {
            currentValue = root.value;
        } else {
            k -= 1;
            currentValue = findValue(root.left, k);
        }
        return currentValue;
    }
}

// This is an input class. Do not edit.
class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
        this.value = value;
    }
}
