package com.shashank.demo.Algorithms.StringsAndArrays.HackerRank;

import java.util.List;

public class HourGlassProblem {
    /*
           0 1 2 3 4 5
        0- 1 1 1 0 0 0
        1- 0 1 0 0 0 0
        2- 1 1 1 0 0 0
        3- 0 0 2 4 4 0
        4- 0 0 0 2 0 0
        5- 0 0 1 2 4 0
     */
    public int computeHighestSum(List<List<Integer>> arr) {
        int row = 0;
        int column;
        int result = 0;
        int resultOfCurrent = 0;
        while (row <= 3) {
            column = 0;
            while (column <= 3) {
                resultOfCurrent = computeResult(arr, row, column);
                if (resultOfCurrent > result) {
                    result = resultOfCurrent;
                }
                column++;
            }
            row++;
        }
        return result;
    }

    private int computeResult(List<List<Integer>> arr, int row, int column) {
        List<Integer> topRow = arr.get(row);
        List<Integer> middleRow = arr.get(row + 1);
        List<Integer> bottomRow = arr.get(row + 2);
        return topRow.get(column) + topRow.get(column + 1) + topRow.get(column + 2) + middleRow.get(column + 1)
                + bottomRow.get(column) + bottomRow.get(column + 1) + bottomRow.get(column + 2);
    }
}
