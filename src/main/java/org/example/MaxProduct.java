package org.example;

import java.util.*;

public class MaxProduct {

    public static int reverse(int num) {
        int number = 1534236469, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);

        return reverse;

    }

    public static boolean palindrome(String str){
        boolean flag = true;

        for(int i=0; i<str.length()/2 ; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1 -i)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static String longestPalin(String str){

        TreeMap<Integer, String> palindromesMap = new TreeMap<>();
        String palindromeStr;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length()+1; j++){
                palindromeStr = str.substring(i, j);
                if(palindrome(palindromeStr)){
                    palindromesMap.put(palindromeStr.length(), palindromeStr);
                }
            }
        }

        return palindromesMap.descendingMap().firstEntry().getValue();
    }

    public static int getMaxLen(String str){

       int end = 0, start = 0;
       List<Character> characterList = new ArrayList<>();

       while (end<str.length()){
           if(!characterList.contains(str.charAt(end))){
               characterList.add(str.charAt(end));
               end++;
           }else{
               characterList.remove(Character.valueOf(str.charAt(start)));
               start++;
           }
       }
        return characterList.size();

    }

    public static List<Integer> mergedList(List<Integer> list1, List<Integer> list2){
        List<Integer> list3 = new ArrayList<>();

        list3.addAll(list1);
        list3.addAll(list2);

        return list3;

    }


    public static void main(String [] args) {
        //System.out.println(reverse(1534236469));
        System.out.println(getMaxLen("abcdabcbb"));
    }
}
