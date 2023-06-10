package com.shashank.demo.Algorithms.LinkedLists;

public class MSumOfLinkedLists {

    // 2-4-7-1
    // 9-4-5

    // 1742
    //  549
    // 2291 --> 1-9-2-2

    public LinkedList add(LinkedList list1, LinkedList list2) {

        LinkedList pointer1 = list1;
        LinkedList pointer2 = list2;
        int carryForward = 0;
        int numberForNewNode = 0;

        LinkedList headOfResult = null;
        LinkedList currentPointOfResult = headOfResult;

        while (pointer1 != null || pointer2 != null) {
            int currentSum = 0;
            if (pointer1 == null) {
                currentSum = pointer2.value;
            } else if (pointer2 == null) {
                currentSum = pointer1.value;
            } else {
                currentSum = pointer1.value + pointer2.value;
            }

            if (currentSum > 9) {
                currentSum = carryForward > 0 ? currentSum + carryForward : currentSum;
                carryForward = currentSum / 10;
                numberForNewNode = currentSum % 10;
            } else {
                numberForNewNode = carryForward > 0 ? currentSum + carryForward : currentSum;
                carryForward = 0;
            }

            LinkedList newNode = new LinkedList(numberForNewNode);
            if (headOfResult == null) {
                headOfResult = newNode;
                currentPointOfResult = headOfResult;
            } else {
                currentPointOfResult.next = newNode;
                currentPointOfResult = currentPointOfResult.next;
            }

            pointer1 = pointer1 != null ? pointer1.next : null;
            pointer2 = pointer2 != null ? pointer2.next : null;
        }

        return headOfResult;
    }
}
