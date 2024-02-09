package org.example;

public class HayStack {

    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

            if(haystack.contains(needle)){
                return haystack.indexOf(needle);
            }else{
                return -1;
            }
    }
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "but"));
    }
}
