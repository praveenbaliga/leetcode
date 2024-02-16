package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSortList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0);
        list.add(50);
        list.add(48);

        list.forEach(System.out::println); // before sorting

        Collections.sort(list,(i,j) -> (i > j)? -1: (i<j)? 1:0);
        System.out.println("-------------");
        list.forEach(System.out::println); // After sorting

        list.sort(Comparator.reverseOrder()); // another way of sorting items
        System.out.println("-------------");
        list.forEach(System.out::println); // After sorting
    }
}
