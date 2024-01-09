package org.example;

import java.util.Arrays;

public class SelectionSort {

    public static int []  selectionSort(int[] array){

        int small;
        int temp;
        int indexOfJ = 0;
        boolean flag = false;
        for(int i=0; i<array.length-1; i++){
            small = array[i];
            for(int j=i+1; j<array.length; j++){
                if(small > array[j]){
                    flag = true;
                    small = array[j];
                    indexOfJ = j;
                }
            }
            if(flag) { // execute this only if there was a small item found, thus the flag used here
                temp = array[i];
                array[i] = small;
                array[indexOfJ] = temp;
            }
            flag = false;

        }
        Arrays.stream(array).forEach(System.out::print);
        return array;
    }

    public static void main(String[] args) {
        selectionSort(new int [] { 7,8,3,1,2});
    }
}
