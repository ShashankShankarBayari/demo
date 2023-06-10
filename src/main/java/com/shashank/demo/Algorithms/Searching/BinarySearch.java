package com.shashank.demo.Algorithms.Searching;

public class BinarySearch {

    public boolean searchElement(int searchElement, int[] input) {
        int left = 0;
        int right = input.length - 1;
        while (left <= right) {
            int midPoint = (left + right) / 2;
            if (searchElement == input[midPoint]) {
                return true;
            } else if (searchElement > input[midPoint]) {
                left = midPoint + 1;
            } else {
                right = midPoint - 1;
            }
        }
        return false;
    }
}
