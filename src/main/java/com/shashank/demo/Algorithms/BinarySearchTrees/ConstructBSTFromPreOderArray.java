package com.shashank.demo.Algorithms.BinarySearchTrees;

import java.util.List;

public class ConstructBSTFromPreOderArray {

    // [10,4,2,1,5,17,19,18]

    public BST constructBST(List<Integer> preOrderTraversalValues) {
        return buildBSTUtil(preOrderTraversalValues);

    }

    private BST buildBSTUtil(List<Integer> preOrderTraversalValues) {

        if (preOrderTraversalValues.size() == 0) {
            return null;
        }

        int rootValue = preOrderTraversalValues.get(0);
        int i = 0;
        for (i = 1; i < preOrderTraversalValues.size(); i++) {
            if (preOrderTraversalValues.get(i) > rootValue)
                break;
        }

        BST root = new BST(rootValue);
        root.left = buildBSTUtil(preOrderTraversalValues.subList(1, i));
        root.right = buildBSTUtil(preOrderTraversalValues.subList(i, preOrderTraversalValues.size()));

        return root;
    }

}
