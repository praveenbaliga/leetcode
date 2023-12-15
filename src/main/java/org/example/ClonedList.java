package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClonedList {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("Praveen", "Baliga");
        ArrayList<String> arrayListCloned = new ArrayList<>(al);
        System.out.println(arrayListCloned);
    }
}
