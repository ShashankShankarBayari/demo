package com.shashank.demo.Algorithms;

import java.util.List;

public class WaterContainerFinder {

    public int findmaxWaterCapacity(List<Integer> wallHeightsList) {
        int maximumCapacity = 0, currentCapacity = 0;
        int leftWall = 0;
        int rightWall = leftWall + 1;

        while (rightWall < wallHeightsList.size()) {

            if (wallHeightsList.get(leftWall) < wallHeightsList.get(rightWall)) {
                currentCapacity = wallHeightsList.get(leftWall) * (rightWall - leftWall);
                leftWall = rightWall;
                rightWall = rightWall + 1;
            } else {
                currentCapacity = wallHeightsList.get(rightWall) * (rightWall - leftWall);
                rightWall++;
            }
            maximumCapacity = currentCapacity > maximumCapacity ? currentCapacity : maximumCapacity;
        }
        return maximumCapacity;
    }
}
