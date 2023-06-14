/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Assume that you have a 10*10 board
// You have a dice that can roll from 1-6
// https://www.techiedelight.com/min-throws-required-to-win-snake-and-ladder-game/
public class SnakeAndLadder {

  public int findMinStepsToDestination(Map<Integer, Integer> snakes, Map<Integer, Integer> ladder, int size) {
    Graph graph = constructGraph(snakes, ladder);
    return traverseGraphUsingBFS(graph, new Node(0, 0), size);
  }

  private Graph constructGraph(Map<Integer, Integer> snakes, Map<Integer, Integer> ladder) {
    List<Edge> edges = new ArrayList<>();
    List<Integer> vertexes = new ArrayList<>();

    int boardSize = 10 * 10;
    for (int i = 0; i < boardSize; i++) {
      vertexes.add(i);
      for (int j = 1; j <= 6 && i + j <= boardSize; j++) {
        int source = i;
        int dest = i + j;
        if (snakes.containsKey(dest)) {
          edges.add(new Edge(source, snakes.get(dest)));
        } else if (ladder.containsKey(dest)) {
          edges.add(new Edge(source, ladder.get(dest)));
        } else {
          edges.add(new Edge(source, dest));
        }
      }
    }
    return new Graph(edges, vertexes);
  }

  private int traverseGraphUsingBFS(Graph graph, Node source, int size) {
    Queue<Node> queue = new ArrayDeque<>();
    Set<Integer> visited = new HashSet<>();
    queue.add(source);

    while (!queue.isEmpty()) {
      Node current = queue.poll();
      if (!visited.contains(current.ver)) {
        visited.add(current.ver);
        if (current.ver == size) {
          return current.min_dist;
        }
        graph.adjacencyList.get(current.ver).forEach(destNode -> {
          queue.add(new Node(destNode, current.min_dist + 1));
        });
      }
    }
    return -1;
  }
}

class Graph {
  List<List<Integer>> adjacencyList = new ArrayList<>();
  List<Integer> vertexes;

  public Graph(List<Edge> edges, List<Integer> vertexes) {
    vertexes.forEach(vertex -> adjacencyList.add(new ArrayList<>()));
    edges.forEach(edge -> adjacencyList.get(edge.source).add(edge.destination));
  }
}

class Edge {
  int source, destination;

  Edge(int source, int destination) {
    this.source = source;
    this.destination = destination;
  }
}

class Node {
  int ver;
  int min_dist;

  public Node(int ver, int min_dist) {
    this.ver = ver;
    this.min_dist = min_dist;
  }
}


