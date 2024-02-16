package org.example;

import java.util.TreeSet;

public class CustomSortSet {
    public static void main(String[] args) { // reverse order
        TreeSet<Integer> treeSet = new TreeSet<>((i,j) -> (i>j)? -1: (i<j)? 1:-1);
        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(100);
        treeSet.add(99);

        treeSet.forEach(System.out::println);

    }
}
