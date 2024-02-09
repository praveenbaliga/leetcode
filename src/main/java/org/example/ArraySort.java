package org.example;

public class ArraySort {

    public static void main(String[] args) {
        String str = "My company is software";
        char [] chars = str.toCharArray();
        char temp;

        for(int i=0; i<chars.length; i++){
            for(int j=i+1; j<chars.length; j++){
                if(chars[i] > chars[j]){
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        System.out.println(chars);
    }
}
