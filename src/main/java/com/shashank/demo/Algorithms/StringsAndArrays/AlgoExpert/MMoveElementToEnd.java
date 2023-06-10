package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

import java.util.List;

public class MMoveElementToEnd {

    // [2,1,2,2,2,3,4,2,2]
    public List<Integer> move(List<Integer> input, int target) {
        int start = 0;
        int end = input.size() - 1;
        while (start <= end) {
            if (input.get(start) == target) {
                while (input.get(end) == target && start < end) {
                    end--;
                }
                if (start > end)
                    break;
                int temp = input.get(start);
                input.set(start, input.get(end));
                input.set(end, temp);
                start++;
                end--;
            } else {
                start++;
            }
        }
        return input;
    }
}
