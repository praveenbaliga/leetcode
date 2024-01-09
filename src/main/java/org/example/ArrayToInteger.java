package org.example;

import java.math.BigInteger;

public class ArrayToInteger {
    public static int arrayToInteger(int[] digits) {
        StringBuilder sb = new StringBuilder();

        for (int digit : digits) {
            sb.append(digit);
        }

        // Convert the StringBuilder to BigInteger and then to int
        BigInteger bigInteger = new BigInteger(sb.toString());
        return bigInteger.intValue();
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5}; // Replace this array with your digits
        int result = arrayToInteger(digits);
        System.out.println("The converted integer is: " + result);
    }
}