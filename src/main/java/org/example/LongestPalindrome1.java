package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPalindrome1 {

    public static boolean palindromeCheck(String palCheck){
        boolean flag = true;
        for(int i=0; i<palCheck.length()/2; i++){
            if(palCheck.charAt(i)!=palCheck.charAt(palCheck.length()-1 - i)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        Map<String, Integer> palimdromeMap = new HashMap<>();
        String myString = "abccba";
        String palString = "";
        for (int i=0; i<myString.length(); i++){
            for(int j=i+1; j<=myString.length(); j++){
                palString = myString.substring(i, j);
                if(palindromeCheck(myString.substring(i, j))){
                    palimdromeMap.put(palString, palString.length());
                }
            }
        }
        palimdromeMap.forEach((k,v) -> System.out.println(k+ ", Stock : " +v));
    }

}