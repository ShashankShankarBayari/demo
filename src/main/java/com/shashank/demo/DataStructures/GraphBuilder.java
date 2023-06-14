/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.DataStructures;

import java.util.ArrayList;
import java.util.List;

public class GraphBuilder {
  List<List<Integer>> adjacencyList = new ArrayList<>(); // List of connections
  //    src   dest
  // Ex: 0 -> 1,2
  //     1 -> 3,5
  //     2 -> 3
  //     3 -> 4,5
  //     4 -> 5
  List<Integer> vertexes; // List of nodes in the graph

  public GraphBuilder(List<Edge> edges, List<Integer> vertexes) {
    this.vertexes = vertexes;
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
