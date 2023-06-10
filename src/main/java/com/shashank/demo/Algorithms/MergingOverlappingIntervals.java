/*
 * Copyright (c) 2023 Splunk, Inc. All rights reserved.
 */

package com.shashank.demo.Algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import org.apache.commons.lang3.tuple.Pair;

public class MergingOverlappingIntervals {

  public List<Pair<Integer, Integer>> mergeOverlappingIntervals(List<Pair<Integer, Integer>> intervals) {
    Stack<Pair<Integer, Integer>> resultStack = new Stack<>();
    Collections.sort(intervals, Comparator.comparingInt(a -> a.getLeft()));

    resultStack.push(intervals.get(0));

    intervals.forEach(pair -> {
      Pair<Integer, Integer> peek = resultStack.peek();
      if (peek.getRight() >= pair.getLeft() && peek.getRight() < pair.getRight()) {
        resultStack.pop();
        resultStack.push(Pair.of(peek.getLeft(), pair.getRight()));
      } else if (peek.getRight() < pair.getLeft()) {
        resultStack.push(pair);
      }
    });
    return resultStack;
  }
}
