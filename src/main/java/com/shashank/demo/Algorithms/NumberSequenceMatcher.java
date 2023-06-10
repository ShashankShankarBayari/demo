package com.shashank.demo.Algorithms;

import java.util.List;

public class NumberSequenceMatcher {

    public boolean validate(List<Integer> array, List<Integer> sequence) {
        int lastFoundIndex = -1;
        boolean isSequenceFound = true;

        for (Integer number : sequence) {
            int index = array.indexOf(number);
            if (index != -1 && index > lastFoundIndex) {
                lastFoundIndex = index;
            } else {
                isSequenceFound = false;
                break;
            }
        }
        return isSequenceFound;
    }
}
