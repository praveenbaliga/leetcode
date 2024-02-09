package org.example;

public class DisplayNumericFromString {
    public static void main(String[] args) {
        String str = "1nd1a";

        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
        }
    }
}
