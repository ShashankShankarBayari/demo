package com.shashank.demo.Algorithms.StringsAndArrays.HackerRank;

import java.util.List;

public class JumpingClouds {

    public int findMinimumNumberOfJumps(List<Integer> c) {
        int index = 0;
        int numberOfJumps = 0;
        while (index < (c.size() - 2)) {
            if (c.get(index) == 0) {
                if (c.get(index + 2) == 0 && index < c.size()) {
                    numberOfJumps++;
                    index += 2;
                } else {
                    numberOfJumps++;
                    index += 1;
                }
            } else {
                numberOfJumps++;
                index += 1;
            }
        }
        if (index != c.size() - 1) {
            numberOfJumps++;
        }
        return numberOfJumps;
    }
}
