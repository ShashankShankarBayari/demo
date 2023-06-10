package com.shashank.demo.Algorithms;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergingOverlappingIntervalsTest {

  private MergingOverlappingIntervals cut;

  @BeforeEach
  public void setup(){
    cut = new MergingOverlappingIntervals();
  }

  @Test
  void mergeOverlappingIntervals() {
    List<Pair<Integer, Integer>> intervalPairs = new ArrayList<>();
    intervalPairs.add(Pair.of(12,15));
    intervalPairs.add(Pair.of(1,5));
    intervalPairs.add(Pair.of(8,10));
    intervalPairs.add(Pair.of(2,3));
    intervalPairs.add(Pair.of(4,6));
    intervalPairs.add(Pair.of(7,8));

    List<Pair<Integer, Integer>> result  = cut.mergeOverlappingIntervals(intervalPairs);
  }
}