package org.example;

public class CountChars {
    public static void main(String[] args) {
        String str = "Praveen";

        char ch = str.charAt(0);
        int count = 1;

        for (int i=1; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }else{
                System.out.println(ch + ": "  + count);
                count = 1;
                ch =  str.charAt(i);
            }

        }
        System.out.print(ch + ": "  + count);
    }
}
