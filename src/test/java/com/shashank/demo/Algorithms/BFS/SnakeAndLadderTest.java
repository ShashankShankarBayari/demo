package com.shashank.demo.Algorithms.BFS;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakeAndLadderTest {

  @Test
  void findMinStepsToDestination() {
    SnakeAndLadder cut = new SnakeAndLadder();
    // snakes and ladders are represented using a map.
    Map<Integer, Integer> ladder = new HashMap<>();
    Map<Integer, Integer> snake = new HashMap<>();

    // insert ladders into the map
    ladder.put(1, 38);
    ladder.put(4, 14);
    ladder.put(9, 31);
    ladder.put(21, 42);
    ladder.put(28, 84);
    ladder.put(51, 67);
    ladder.put(72, 91);
    ladder.put(80, 99);

    // insert snakes into the map
    snake.put(17, 7);
    snake.put(54, 34);
    snake.put(62, 19);
    snake.put(64, 60);
    snake.put(87, 36);
    snake.put(93, 73);
    snake.put(95, 75);
    snake.put(98, 79);

    System.out.println(cut.findMinStepsToDestination(ladder, snake, 100));
  }
}