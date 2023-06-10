package com.shashank.demo.Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneKeyWordMatcher {

    public List<String> findWordsMatchingPhoneNumber(List<String> wordList, String phoneNumber) {
        HashMap<Character, Integer> keypadMap = createCharacterMap();
        List<Integer> phoneNumberList = convertPhoneNumberIntoList(phoneNumber);
        List<String> output = new ArrayList<>();

        for (String currentWord : wordList) {
            char[] wordCharacterArray = currentWord.toCharArray();

            List<Integer> occurances = findOccurances(phoneNumberList, keypadMap.get(wordCharacterArray[0]));
            for (Integer index : occurances) {
                if (doesWordMatch(wordCharacterArray, phoneNumber, phoneNumberList, keypadMap, index)) {
                    output.add(currentWord);
                }
            }
        }
        return output;

    }

    private List<Integer> findOccurances(List<Integer> phoneNumberList, int c) {
        List<Integer> indexesOfFoundOccurances = new ArrayList<>();
        for (int i = 0; i <= phoneNumberList.size() - 1; i++) {
            if (phoneNumberList.get(i) == c) {
                indexesOfFoundOccurances.add(i);
            }
        }
        return indexesOfFoundOccurances;
    }

    private boolean doesWordMatch(char[] wordCharacterArray, String phoneNumber, List<Integer> phoneNumberList,
            HashMap<Character, Integer> keypadMap, int j) {

        boolean found = false;
        int i = 0;
        while (i <= wordCharacterArray.length - 1) {
            if (j <= phoneNumber.length() - 1) {
                if (phoneNumberList.get(j) == keypadMap.get(wordCharacterArray[i])) {
                    if (i == wordCharacterArray.length - 1) {
                        found = true;
                        break;
                    } else {
                        i++;
                        j++;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return found;
    }

    private HashMap<Character, Integer> createCharacterMap() {
        HashMap<Character, Integer> keypadMap = new HashMap<>();
        keypadMap.put('a', 2);
        keypadMap.put('b', 2);
        keypadMap.put('c', 2);
        keypadMap.put('d', 3);
        keypadMap.put('e', 3);
        keypadMap.put('f', 3);
        keypadMap.put('g', 4);
        keypadMap.put('h', 4);
        keypadMap.put('i', 4);
        keypadMap.put('j', 5);
        keypadMap.put('k', 5);
        keypadMap.put('l', 5);
        keypadMap.put('m', 6);
        keypadMap.put('n', 6);
        keypadMap.put('o', 6);
        keypadMap.put('p', 7);
        keypadMap.put('q', 7);
        keypadMap.put('r', 7);
        keypadMap.put('s', 7);
        keypadMap.put('t', 8);
        keypadMap.put('u', 8);
        keypadMap.put('v', 8);
        keypadMap.put('w', 9);
        keypadMap.put('x', 9);
        keypadMap.put('y', 9);
        keypadMap.put('z', 9);
        return keypadMap;

    }

    private List<Integer> convertPhoneNumberIntoList(String phoneNumber) {
        List<Integer> phoneNumberArray = new ArrayList<>();
        for (char number : phoneNumber.toCharArray()) {
            phoneNumberArray.add(Integer.parseInt(String.valueOf(number)));
        }
        return phoneNumberArray;
    }
}
