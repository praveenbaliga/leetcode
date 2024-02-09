package org.example;

import java.util.*;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        Map<Character, Integer> map = new HashMap<>();
        if (str.isEmpty()){
            return null;
        }else{

            for(int i=0; i<str.length(); i++){
                if(map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                }else{
                    map.put(str.charAt(i), 1);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(Kata.count("abvdd"));
    }
}
