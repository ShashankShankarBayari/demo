package com.shashank.demo.Algorithms.BFS;

import java.util.Objects;

public class Cell {
  int x, y, distanceTravelled;

  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Cell(int x, int y, int dist) {
    this.x = x;
    this.y = y;
    this.distanceTravelled = dist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cell node = (Cell) o;
    return x == node.x &&
      y == node.y &&
      distanceTravelled == node.distanceTravelled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, distanceTravelled);
  }
}
