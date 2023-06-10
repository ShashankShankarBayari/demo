package com.shashank.demo.Algorithms.StringsAndArrays;

import org.junit.jupiter.api.Test;

class FindIfStringIsASubstringTest {

    private FindIfStringIsASubstring cut;

    @Test
    void isSubString() {
        cut = new FindIfStringIsASubstring();
        System.out.println(cut.isSubString("Shashank", "abc"));
    }
}