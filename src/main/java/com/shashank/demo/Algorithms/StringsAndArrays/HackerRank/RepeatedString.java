package com.shashank.demo.Algorithms.StringsAndArrays.HackerRank;

public class RepeatedString {

    public long findCount(String s, long n) {
        char[] array = s.toCharArray();
        int aCount = 0;
        int lenght = array.length;
        for (char letter : array) {
            if (letter == 'a') {
                aCount++;
            }
        }
        if (aCount != 0) {
            if (n % array.length == 0) {
                return ((n * aCount) / array.length);
            } else {
                long temp = ((n * aCount) / array.length);
                for (int i = 0; i < n % array.length; i++) {
                    if (array[i] == 'a')
                        temp++;
                }
                return temp;
            }
        }
        return 0;
    }
}
