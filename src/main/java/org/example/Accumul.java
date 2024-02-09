package org.example;

public class Accumul {

    public static String accum(String s){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            result.append(Character.toUpperCase(currentChar)); // Uppercase the current character

            for (int j = 0; j < i; j++) {
                result.append(Character.toLowerCase(currentChar)); // Lowercase the current character i times
            }

            if (i < s.length() - 1) {
                result.append("-"); // Add a hyphen between each set of characters
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
            accum("abcd");
    }
}
