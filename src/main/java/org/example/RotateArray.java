package org.example;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int [] array, int shiftBy){

        // create a loop for number of times the array should rotate
        int firstItem;
        for (int i=0; i<shiftBy; i++){
            firstItem = array[0];
            for(int j=1; j<array.length; j++){
                array[j-1] = array[j];
            }
            array[array.length - 1] = firstItem;
        }
        Arrays.stream(array).forEach(System.out::println);

    }

    public static void rotateRight(int [] array, int shiftBy){

        // create a loop for number of times the array should rotate
        int firstItem, temp;
        for (int i=0; i<shiftBy; i++){
            firstItem = array[array.length - 1];
            for(int j=array.length-1; j>0; j--){
                array[j] = array[j-1];
            }
            array[0] = firstItem;
        }
        Arrays.stream(array).forEach(System.out::print);

    }
    public static void main(String[] args) {
        int [] array = new int[]{5,8,0,4};
      //  rotate(array, 4);
        rotateRight(array, 2);

    }

}
