package com.shashank.demo.DataStructures;

public class BinarySearchTree {
    private DoublyNode root = null;
    private NodeQueue queue;

    public BinarySearchTree() {
        queue = new NodeQueue();
    }

    public DoublyNode insertNodeIntoBST(DoublyNode root, int data) {
        DoublyNode newNode = createNewNode(data);
        if (root == null) {
            root = newNode;
        } else if (data <= root.data) {
            root.left = insertNodeIntoBST(root.left, data);
        } else {
            root.right = insertNodeIntoBST(root.right, data);
        }

        return root;
    }

    public DoublyNode insertNodeIterative(int data) {
        DoublyNode currentNode = root;
        DoublyNode newNode = createNewNode(data);
        if (currentNode == null) {
            root = newNode;
            currentNode = root;
        } else {
            currentNode = getNodeWhereNewNodeCanBeInserted(currentNode, data);
            if (data <= currentNode.data) {
                currentNode.left = newNode;
            } else {
                currentNode.right = newNode;
            }
        }
        return currentNode;
    }

    public boolean searchTreeForValue(int searchValue, DoublyNode root) {
        DoublyNode currentNode = root;
        if (root == null) {
            return false;
        } else {
            while (currentNode != null) {
                if (searchValue == currentNode.data) {
                    return true;
                } else if (searchValue <= currentNode.data) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }
            return false;
        }
    }

    public boolean searchValueRecurssive(DoublyNode root, int searchValue) {
        if (root == null) {
            return false;
        }
        if (searchValue == root.data) {
            return true;
        }
        if (searchValue < root.data) {
            return searchValueRecurssive(root.left, searchValue);
        } else {
            return searchValueRecurssive(root.right, searchValue);
        }
    }

    public int findMaximumValueInBST() {
        DoublyNode currentNode = root;
        int maxValue = -1;
        if (root == null) {
            return -1;
        } else {
            while (currentNode != null) {
                maxValue = currentNode.data;
                currentNode = currentNode.right;
            }
        }
        return maxValue;
    }

    public int findMinimumValueInBST(DoublyNode root) {
        DoublyNode currentNode = root;
        if (root == null) {
            return -1;
        } else {
            while (currentNode.left != null) {
                currentNode = currentNode.left;
            }
        }
        return currentNode.data;
    }

    public void breadthFirstPrint(DoublyNode root) {
        if (root == null) {
            return;
        }
        queue.enQueue(root);
        while (!queue.isEmpty()) {
            DoublyNode currentNode = queue.deQueue();
            System.out.println(currentNode.data);
            if (currentNode.left != null) {
                queue.enQueue(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.enQueue(currentNode.right);
            }
        }
    }

    public void Inorder(DoublyNode root) {
        if (root == null)
            return;
        else {
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
    }

    public void preOrder(DoublyNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(DoublyNode root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data + " ");
    }

    public int findHeightOfBST(DoublyNode root) {
        if (root == null) {
            return -1;
        }
        return Math.max(findHeightOfBST(root.left), findHeightOfBST(root.right)) + 1;
    }

    boolean isBST(DoublyNode root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBSTUtil(DoublyNode node, int min, int max) {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.data) && isBSTUtil(node.right, node.data, max));
    }

    public DoublyNode deleteNodeInBST(DoublyNode root, int valueToBeDeleted) {
        if (root == null) {
            return null;
        }
        if (root.data == valueToBeDeleted) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int smallestValue = findMinimumValueInBST(root.right);
                root.data = smallestValue;
                root.right = deleteNodeInBST(root.right, smallestValue);
                return root;
            }
        } else if (valueToBeDeleted < root.data) {
            return deleteNodeInBST(root.left, valueToBeDeleted);
        } else if (valueToBeDeleted > root.data) {
            return deleteNodeInBST(root.right, valueToBeDeleted);
        }
        return null;

    }

    private DoublyNode getNodeWhereNewNodeCanBeInserted(DoublyNode currentNode, int data) {
        DoublyNode insertionPoint = null;
        while (currentNode != null) {
            insertionPoint = currentNode;
            if (data <= currentNode.data) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return insertionPoint;
    }

    private DoublyNode createNewNode(int data) {
        DoublyNode node = new DoublyNode();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }
}
