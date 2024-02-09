package org.example;

import java.util.*;

public class DuplicatesArrayList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Praveen", "Praveen", "Baliga", "Priyanaka", "Payal", "Pranav");
        List<String> resultList = new ArrayList<>();

        // Using hashset
        Set<String> resultSet = new HashSet<>();

        for (String str : list){
            if (resultList.contains(str)){
                System.out.println("The item is duplicate : " + str);
            }else{
                resultList.add(str);
            }
        }

        for(String str : list){
            if (!resultSet.add(str)){
                System.out.println("This ia a duplicate item : "+ str);
            }
        }
        System.out.println("------------");
        resultSet.forEach(System.out::println);

    }
}
