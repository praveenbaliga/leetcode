package org.example;

import java.util.Arrays;
import java.util.List;

public class MissingElement {
    public static int findMissingElement(List<Integer> fullList, List<Integer> missingList) {
        int missingNumber = 0;

        for (int i=0; i<fullList.size(); i++){
            missingNumber ^= fullList.get(i);
        }

        for (int i=0; i<missingList.size(); i++){
            missingNumber ^= missingList.get(i);
        }

        return missingNumber;
    }

    public static void main(String[] args) {
        List<Integer> fullList = Arrays.asList(5,8,0,4); // Example full list
        List<Integer> missingList = Arrays.asList(5,0,4); // Example missing list

        int missingElement = findMissingElement(fullList, missingList);
        System.out.println("The missing element is: " + missingElement);
    }
}
