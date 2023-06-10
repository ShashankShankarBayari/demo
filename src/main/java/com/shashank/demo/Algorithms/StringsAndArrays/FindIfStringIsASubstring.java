package com.shashank.demo.Algorithms.StringsAndArrays;

public class FindIfStringIsASubstring {
    // Shashank
    // han
    public boolean isSubString(String string, String subString) {
        int i = 0, j = 0;

        while (i < string.length()) {
            if (j == subString.length()) {
                return true;
            }
            if (string.charAt(i) == subString.charAt(j)) {
                j++;
                i++;
            } else {
                i++;
                j = 0;
            }
        }
        return false;
    }
}
