package org.example;

import java.util.TreeMap;

public class SortMap {
    public static void main(String[] args) { // descending order sort

        //TreeMap<Integer, String> treeMap = new TreeMap<>((i,j) -> (i>j)?-1:(i==j)?0:1); Another way of doing
        TreeMap<Integer, String> treeMap = new TreeMap<>((i,j) -> j.compareTo(i));
        treeMap.put(100,"Praveen");
        treeMap.put(10,"Payal");
        treeMap.put(160,"Praveen");
        treeMap.put(1000,"Praveen");
        treeMap.forEach((k,v) -> System.out.println((k + ":" + v)));

    }

}
