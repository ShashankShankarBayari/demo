package com.shashank.demo.Algorithms.BinarySearchTrees;

import java.util.List;

public class ConstructBalancedBST {

    // [1,2,5,7,10,13,14,15,22]
    public static BST minHeightBst(List<Integer> array) {
        return construct(array, 0, array.size() - 1);
    }

    private static BST construct(List<Integer> array, int begin, int end) {
        if (begin > end) {
            return null;
        }
        int middleElementIndex = (end + begin) / 2;
        BST root = new BST(array.get(middleElementIndex));
        root.left = construct(array, begin, middleElementIndex - 1);
        root.right = construct(array, middleElementIndex + 1, end);
        return root;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}

