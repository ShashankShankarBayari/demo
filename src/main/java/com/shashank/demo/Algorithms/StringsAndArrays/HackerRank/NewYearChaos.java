package com.shashank.demo.Algorithms.StringsAndArrays.HackerRank;

import java.util.List;

public class NewYearChaos {

    //[2, 1, 5, 3, 4]
    //[2, 5, 1, 3, 4]
    //[1, 2, 5, 3, 7, 8, 6, 4]

    public void printNumberOfBribes(List<Integer> input) {
        int numberOfBribes = 0;
        for (int i = input.size() - 1; i >= 0; i--) {
            if (input.get(i) != i + 1) {
                if ((i - 1 >= 0) && input.get(i - 1) == i + 1) {
                    int temp = input.get(i - 1);
                    input.set(i - 1, input.get(i));
                    input.set(i, temp);
                    numberOfBribes++;
                } else if (i - 2 >= 0 && input.get(i - 2) == i + 1) {
                    input.set(i - 2, input.get(i - 1));
                    input.set(i - 1, input.get(i));
                    input.set(i, input.get(i - 2));
                    numberOfBribes += 2;
                    // 5,3,4
                } else {
                    System.out.println("Too Chaotic");
                    return;
                }
            }
        }
        System.out.println(numberOfBribes);
    }
}
