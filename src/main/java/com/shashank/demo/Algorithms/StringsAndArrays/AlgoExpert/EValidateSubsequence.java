package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

import java.util.List;

public class EValidateSubsequence {

    // array = [5,1,22,25,6,-1,8,10]
    // Seq   = [1,6,-1,10]
    public boolean isValidSubsequence(List<Integer> array, List<Integer> subArray) {
        int j = 0;
        int i = 0;
        while (i < subArray.size() && j <= array.size()) {
            if (subArray.get(i) == array.get(j)) {
                i++;
            }
            j++;
        }
        return i == subArray.size();
    }
}
