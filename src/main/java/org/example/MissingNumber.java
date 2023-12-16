package org.example;

public class MissingNumber {
    public static void main(String[] args) {
        int [] array = new int[]{0,1,2,4,5,6};

        int actual = 0;
        int n = array.length;
        int expected = n*(n + 1)/2;

        for(int i=0; i<array.length; i++){
            actual = actual + array[i];
        }
        System.out.println(actual);
        System.out.println(expected);
        System.out.println("The missing number = " + (expected - actual));
    }
}
