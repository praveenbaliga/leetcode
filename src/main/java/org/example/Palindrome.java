package org.example;

public class Palindrome {
    public static void main(String[] args) {
        String str = "rahar";
        int length = str.length() - 1;

        for (int i=0; i<str.length(); i++){
            if(!(str.charAt(i) ==str.charAt(length-i))){
                System.out.println("Not palindrome : ");
                break;
            }
        }
    }
}
