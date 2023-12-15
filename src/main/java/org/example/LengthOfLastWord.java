package org.example;

public class LengthOfLastWord {
    public static int lastWordLength(String str){
        String ltrim = str.replaceAll("^\\s+", "");
        String finalStr = ltrim.replaceAll("\\s+$", "");
        String [] words = finalStr.split(" ");

        if (words.length > 0){
            return words[words.length-1].length();
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(lastWordLength("   fly me   to   the moon  "));
    }
}
