package com.shashank.demo.Algorithms.BinarySearchTrees;

public class EFindClosestValue {

    public int findClosest(BST root, int target) {
        BST currentNode = root;
        int closestValue = root.value;
        int currentClosest;

        while (currentNode.left != null || currentNode.right != null) {
            int valueAtLeftNode, valueAtRightNode;
            valueAtLeftNode = currentNode.left == null ? Integer.MAX_VALUE : currentNode.left.value;
            valueAtRightNode = currentNode.right == null ? Integer.MAX_VALUE : currentNode.right.value;

            if (currentNode.value == target) {
                return currentNode.value;
            }

            if (Math.abs(target - valueAtLeftNode) > Math.abs(target - valueAtRightNode)) {
                currentClosest = Math.abs(target - currentNode.value) > Math.abs(target - valueAtRightNode) ?
                        valueAtRightNode :
                        currentNode.value;
                currentNode = currentNode.right;
            } else {
                currentClosest = Math.abs(target - currentNode.value) > Math.abs(target - valueAtLeftNode) ?
                        valueAtLeftNode :
                        currentNode.value;
                currentNode = currentNode.left;
            }
            closestValue =
                    Math.abs(target - currentClosest) < Math.abs(target - closestValue) ? currentClosest : closestValue;
        }
        return closestValue;
    }

    class BST {
        int value;
        BST left;
        BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
