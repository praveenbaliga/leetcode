package org.example;

import java.util.Arrays;

public class InvertItems
{
    public static void main(String[] args)
    {
        int temp=0;
        int[] arr1 = new int[]{5,10,17,23,30,47,50};

        for(int i=0; i<arr1.length-1; i+=2)
        {
            temp = arr1[i];
            arr1[i] = arr1[i+1];
            arr1[i+1] = temp;
        }
        System.out.println("Inverted: "+Arrays.toString(arr1));
    }
}
