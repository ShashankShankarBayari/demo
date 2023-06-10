package com.shashank.demo.DataStructures;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GraphTest {

    private Graph cut;

    @BeforeEach
    void setUp() {
        cut = new Graph();
    }

    @Test
    void addNodeToGraphUsingBST() {
        /*   Let us create following BST
              A(0)  ---  B(1)
           /     \       |   \
          C(2)   D(3)  E(4) F(5)
          \        \   /   /
          G(6)       H(7)             */
        cut.addNodeToGraphWithBST("A", Arrays.asList(1, 2, 3));
        cut.addNodeToGraphWithBST("B", Arrays.asList(0, 4, 5));
        cut.addNodeToGraphWithBST("C", Arrays.asList(0, 6));
        cut.addNodeToGraphWithBST("D", Arrays.asList(0, 7));
        cut.addNodeToGraphWithBST("E", Arrays.asList(1, 7));
        cut.addNodeToGraphWithBST("F", Arrays.asList(1, 7));
        cut.addNodeToGraphWithBST("G", Arrays.asList(2, 7));
        cut.addNodeToGraphWithBST("H", Arrays.asList(3, 4, 5, 6));
        cut.printAllAdjacentNodesOfUsingBST("G");
        System.out.println(cut.areTwoNodesConnected("D", "H"));
    }

    @Test
    void addNodeToGraphUsingLinkedList() {
        /*   Let us create following BST
              A(0)  ---  B(1)
           /     \       |   \
          C(2)   D(3)  E(4) F(5)
          \       \   /   /
          G(6) --- H(7)             */
        cut.addNodeToGraphWithLinkedList("A", Arrays.asList("B", "C", "D"));
        cut.addNodeToGraphWithLinkedList("B", Arrays.asList("A", "E", "F"));
        cut.addNodeToGraphWithLinkedList("C", Arrays.asList("A", "G"));
        cut.addNodeToGraphWithLinkedList("D", Arrays.asList("A", "H"));
        cut.addNodeToGraphWithLinkedList("E", Arrays.asList("B", "H"));
        cut.addNodeToGraphWithLinkedList("F", Arrays.asList("B", "H"));
        cut.addNodeToGraphWithLinkedList("G", Arrays.asList("C", "H"));
        cut.addNodeToGraphWithLinkedList("H", Arrays.asList("D", "E", "F", "G"));
        cut.printAllAdjacentNodeUsingLinkedList("H");
        System.out.println(cut.areTwoNodesConnectedUsingLinkedList("D", "C"));
        System.out.println("Nodes connection found via BFS:" + cut.breadthFirstSearch("A", "F"));
        System.out.println("Nodes connection found via DFS:" + cut.depthFirstSearch("A", "F"));
    }
}