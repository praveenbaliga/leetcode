package org.example;

public class MaxRepeat {
    public static void main(String[] args) {
        String str = "abcdeeefghij";
        int [] array = new int[128];
        int val;

        for (int i=0; i<str.length(); i++){
            val = 'z' - str.charAt(i);
            if(array[val] >= 1){
                array[val] = array[val]+1;
            }else{
                array[val] = 1;
            }
        }

        for(int i=0; i<array.length; i++){
            if(array[i]!=0)

            System.out.println("The value of array : " + array[i]);
        }
    }
}
