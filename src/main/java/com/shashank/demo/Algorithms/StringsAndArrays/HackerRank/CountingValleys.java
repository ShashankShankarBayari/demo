package com.shashank.demo.Algorithms.StringsAndArrays.HackerRank;

public class CountingValleys {

    /*Input:UDDDUDUU
      Output:1
      Example:
    _/\       _
       \     /
        \/\/

     */

    public int countValleys(String path) {
        int seaLevelIndicator = 0;
        boolean valleyEntered = false;
        int numberOfValleys = 0;
        char[] input = path.toCharArray();

        for (char step : input) {
            if (seaLevelIndicator < 0) {
                valleyEntered = true;
            }
            if (step == 'U') {
                seaLevelIndicator++;
                if (seaLevelIndicator == 0 && valleyEntered) {
                    numberOfValleys++;
                }
            } else
                seaLevelIndicator--;
        }
        return numberOfValleys;
    }
}
