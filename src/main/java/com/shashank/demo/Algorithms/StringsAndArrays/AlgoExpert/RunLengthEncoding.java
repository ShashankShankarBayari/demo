package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

public class RunLengthEncoding {

    public String runLengthEncoding(String string) {
        String output = "";
        char[] charString = string.toCharArray();
        int currentCount = 0;

        for (int i = 0; i < charString.length; i++) {
            if (i < charString.length - 1 && charString[i] == charString[i + 1] && currentCount < 9) {
                currentCount++;
            } else {
                if (currentCount > 0) {
                    output += (Integer.toString(currentCount) + charString[i]);
                    currentCount = 1;
                } else {
                    output += charString[i];
                }

            }
        }
        return output;
    }
}
