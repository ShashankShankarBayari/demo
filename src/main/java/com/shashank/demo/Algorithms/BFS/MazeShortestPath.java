package com.shashank.demo.Algorithms.BFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class MazeShortestPath {

  public int findShortestPathInMaze(Cell source, Cell destination, int[][] matrix) {
    Queue<Cell> queue = new LinkedList<>();
    Set<Cell> visited = new HashSet<>();

    queue.add(source);

    while (!queue.isEmpty()) {
      Cell current = queue.poll();

      if ((current.x == destination.x) && (current.y == destination.y)) {
        return current.distanceTravelled;
      }

      if (!visited.contains(current)) {
        visited.add(current);
        List<Cell> paths = findPathsForward(current, matrix);
        paths.forEach(cell -> {
          cell.distanceTravelled = current.distanceTravelled + 1;
          queue.add(cell);
        });
      }
    }

    return Integer.MAX_VALUE;
  }

  private List<Cell> findPathsForward(Cell current, int[][] matrix) {
    List<Cell> paths = new ArrayList<>();
    if (isValidCell(current.x + 1, current.y, matrix)) {
      paths.add(new Cell(current.x + 1, current.y));
    }
    if (isValidCell(current.x - 1, current.y, matrix)) {
      paths.add(new Cell(current.x - 1, current.y));
    }
    if (isValidCell(current.x, current.y + 1, matrix)) {
      paths.add(new Cell(current.x, current.y + 1));
    }
    if (isValidCell(current.x, current.y - 1, matrix)) {
      paths.add(new Cell(current.x, current.y - 1));
    }
    return paths;

  }

  private boolean isValidCell(int x, int y, int[][] matrix) {
    return ((x >= 0 && x < matrix[0].length) && (y >= 0 && y < matrix.length));
  }
}
