package com.shashank.demo.Algorithms.BFS;

// Given a chessboard, find the shortest distance (minimum number of steps) taken by a knight(manthri)
// to reach a given destination from a given source. Knight moves in L shape fashion.
// N = 8 (8 × 8 board)
//Source = (7, 0)
//Destination = (0, 7)
//
//Output: Minimum number of steps required is 6

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ChessKnightProblem {

  public int findShortestPathFromSourceToDest(Cell source, Cell destination, int boardSize) {

    Queue<Cell> queue = new LinkedList<>();
    Set<Cell> visited = new HashSet<>();

    queue.add(source);
    while (!queue.isEmpty()) {
      Cell current = queue.poll();
      if (current.x == destination.x && current.y == destination.y) {
        return current.distanceTravelled;
      }

      if (!visited.contains(current)) {
        visited.add(current);
        List<Cell> paths = findPossiblePathsForward(current, boardSize);
        for (Cell cell : paths) {
          cell.distanceTravelled = current.distanceTravelled + 1;
          queue.add(cell);
        }
      }
    }

    return Integer.MAX_VALUE;

  }

  private List<Cell> findPossiblePathsForward(Cell current, int boardSize) {
    List<Cell> paths = new ArrayList<>();
    if (isValidCell(current.x + 1, current.y - 2, boardSize)) {
      paths.add(new Cell(current.x + 1, current.y - 2));
    }
    if (isValidCell(current.x + 2, current.y - 1, boardSize)) {
      paths.add(new Cell(current.x + 2, current.y - 1));
    }
    if (isValidCell(current.x + 2, current.y + 1, boardSize)) {
      paths.add(new Cell(current.x + 2, current.y + 1));
    }
    if (isValidCell(current.x + 1, current.y + 2, boardSize)) {
      paths.add(new Cell(current.x + 1, current.y + 2));
    }
    if (isValidCell(current.x - 1, current.y + 2, boardSize)) {
      paths.add(new Cell(current.x - 1, current.y + 2));
    }
    if (isValidCell(current.x - 2, current.y + 1, boardSize)) {
      paths.add(new Cell(current.x - 2, current.y + 1));
    }
    if (isValidCell(current.x - 2, current.y - 1, boardSize)) {
      paths.add(new Cell(current.x - 2, current.y - 1));
    }
    if (isValidCell(current.x - 1, current.y - 2, boardSize)) {
      paths.add(new Cell(current.x - 1, current.y - 2));
    }
    return paths;
  }

  private boolean isValidCell(int x, int y, int boardSize) {
    return (x >= 0 && x < boardSize) && (y >= 0 && y < boardSize);
  }
}


