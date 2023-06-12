package com.shashank.demo.Algorithms.BFS;

import org.junit.jupiter.api.Test;

class ChessKnightProblemTest {

  @Test
  void findShortestPathFromSourceToDest() {
    ChessKnightProblem cut = new ChessKnightProblem();
    // N x N matrix
    int N = 8;

    // source coordinates
    Cell src = new Cell(0, 7);

    // destination coordinates
    Cell dest = new Cell(7, 0);
    System.out.println("The minimum number of steps required is " +
      cut.findShortestPathFromSourceToDest(src, dest, N));

  }
}