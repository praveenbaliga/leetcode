package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubString {

    public static Boolean unique(String str){
        Boolean flag = true;
        char searchChar;
        for(int i=0; i<str.length(); i++){
            searchChar = str.charAt(i);
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(j)!=searchChar){
                    return flag = false;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> substrings = new HashMap<>();
        String str = "abcdeeefghij";

        for (int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                String subString = str.substring(i,j+1);
                if (unique(subString)){
                    substrings.put(subString, subString.length());
                }
            }
        }
        System.out.println(substrings);
        List<Map.Entry<String, Integer>> listMap = new ArrayList<>(substrings.entrySet());
        listMap.sort(Map.Entry.comparingByValue());
        System.out.println(listMap);


    }
}
