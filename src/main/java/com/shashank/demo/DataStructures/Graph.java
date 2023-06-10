package com.shashank.demo.DataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Graph {
    /*   Let us create following BST
                 A(0)  ---  B(1)
              /     \       |   \
             C(2)   D(3)  E(4) F(5)
             \        \   /   /
             G(6) ----  H(7)             */

    // https://www.baeldung.com/java-graphs

    private Map<String, Integer> vertices = new HashMap<>();
    private Map<Integer, DoublyNode> edgesWithBST = new HashMap<>();
    private Map<Integer, LinkedList> edgesWithLinkedList = new HashMap();

    public void addNodeToGraphWithLinkedList(String vertex, List<String> connectedNodes) {
        int index = vertices.size();
        vertices.put(vertex, index);
        LinkedList<String> nodeList = new LinkedList<>();
        //nodeList.add(vertex);
        for (String node : connectedNodes) {
            nodeList.add(node);
        }
        edgesWithLinkedList.put(vertices.get(vertex), nodeList);
    }

    public void printAllAdjacentNodeUsingLinkedList(String nodeName) {
        Integer nodeIndex = vertices.get(nodeName);
        LinkedList<String> connectedNodes = edgesWithLinkedList.get(nodeIndex);
        connectedNodes.forEach(element -> System.out.println(element + " "));
    }

    public boolean areTwoNodesConnectedUsingLinkedList(String node1, String node2) {
        Integer indexOfNode1 = vertices.get(node1);
        LinkedList<String> connectedNodesOfNode1 = edgesWithLinkedList.get(indexOfNode1);
        return connectedNodesOfNode1.stream().filter(element -> element.equals(node2)).findFirst().isPresent();
    }

    public void addNodeToGraphWithBST(String vertex, List<Integer> connectedNodes) {
        int index = vertices.size();
        vertices.put(vertex, index);
        edgesWithBST.put(index, createBinarySearchTreeOfConnectedNodes(index, connectedNodes));
    }

    public void printAllAdjacentNodesOfUsingBST(String nodeName) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.Inorder(edgesWithBST.get(vertices.get(nodeName)));
    }

    public boolean areTwoNodesConnected(String node1, String node2) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        DoublyNode rootOfConnectedNodesTree = edgesWithBST.get(vertices.get(node1));
        int node2IntRepresentation = vertices.get(node2);
        return binarySearchTree.searchTreeForValue(node2IntRepresentation, rootOfConnectedNodesTree);
    }

    public boolean breadthFirstSearch(String source, String destination) {
        LinkedList<String> nodesToVisit = new LinkedList<>();
        HashSet<String> alreadyVisited = new HashSet<>();

        nodesToVisit.add(source);
        while (!nodesToVisit.isEmpty()) {
            String currentNode = nodesToVisit.remove();
            if (currentNode == destination) {
                return true;
            }
            if (alreadyVisited.contains(currentNode)) {
                continue;
            }
            alreadyVisited.add(currentNode);
            int indexOfCurrentVertex = vertices.get(currentNode);
            LinkedList<String> connectedNodesOfCurrentNode = edgesWithLinkedList.get(indexOfCurrentVertex);
            connectedNodesOfCurrentNode.forEach(node -> nodesToVisit.add(node));
        }
        return false;
    }

    public boolean depthFirstSearch(String source, String destination) {
        Stack<String> nodeToVisit = new Stack<>();
        HashSet<String> alreadyVisited = new HashSet<>();

        nodeToVisit.push(source);
        while (!nodeToVisit.isEmpty()) {
            String currentNodeValue = nodeToVisit.pop();
            if (currentNodeValue == destination) {
                return true;
            }

            if (alreadyVisited.contains(currentNodeValue)) {
                continue;
            }
            alreadyVisited.add(currentNodeValue);
            int indexOfCurrentNodeInVertices = vertices.get(currentNodeValue);
            LinkedList<String> adjacentNodesOfCurrentNode = edgesWithLinkedList.get(indexOfCurrentNodeInVertices);
            adjacentNodesOfCurrentNode.forEach(element -> nodeToVisit.push(element));
        }
        return false;
    }

    private DoublyNode createBinarySearchTreeOfConnectedNodes(int vertex, List<Integer> connectedNodes) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        DoublyNode root = binarySearchTree.insertNodeIterative(connectedNodes.get(0));
        for (int i = 1; i < connectedNodes.size(); i++) {
            binarySearchTree.insertNodeIterative(connectedNodes.get(i));
        }
        return root;
    }
}
