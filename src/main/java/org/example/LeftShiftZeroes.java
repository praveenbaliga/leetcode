package org.example;

import java.util.Arrays;

public class LeftShiftZeroes {
    public static void main(String[] args) {
        //int [] array = new int[]{0,10,2,1};
        int [] array = new int[]{0,10,0,0,60,30,0,200,0};
        int temp;
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
       Arrays.stream(array).forEach(System.out::println);
    }
}
