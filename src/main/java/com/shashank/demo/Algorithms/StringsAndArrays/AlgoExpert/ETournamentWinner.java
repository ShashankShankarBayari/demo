package com.shashank.demo.Algorithms.StringsAndArrays.AlgoExpert;

import java.util.HashMap;
import java.util.List;

public class ETournamentWinner {

    /*
    competitions = [
    ["HTML", "C#"]
    ["C#", "Python"]
    ["Python", "HTML"]
    ]

    Results = [0,0,1]
    * */

    public String findWinner(List<List<String>> competitions, List<Integer> results) {
        HashMap<String, Integer> lookUp = new HashMap<>();
        String currentBestTeam = "";
        for (int i = 0; i < competitions.size(); i++) {
            String matchWinner = findMatchWinner(competitions.get(i), results, i);
            if (lookUp.containsKey(matchWinner)) {
                lookUp.put(matchWinner, lookUp.get(matchWinner) + 3);
            } else {
                if (lookUp.isEmpty()) {
                    currentBestTeam = matchWinner;
                }
                lookUp.put(matchWinner, 3);

            }
            if (lookUp.get(matchWinner) > lookUp.get(currentBestTeam)) {
                currentBestTeam = matchWinner;
            }
        }
        return currentBestTeam;
    }

    private String findMatchWinner(List<String> participants, List<Integer> results, int matchNumber) {
        if (results.get(matchNumber) == 1)
            return participants.get(0);
        else
            return participants.get(1);
    }
}
