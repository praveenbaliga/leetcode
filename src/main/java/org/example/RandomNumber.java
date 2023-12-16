package org.example;

import java.util.function.Supplier;

import static java.lang.Math.abs;

public class RandomNumber {
    public static void main(String[] args) {

//        int otp = 0;
//        int lastDigit;
//
//        for(int i=0; i<6; i++){
//            lastDigit = (int)System.currentTimeMillis()%10;
//            otp = lastDigit + otp;
//        }
//        System.out.println(abs(otp - 129456));
        Supplier<String> supplier = () ->{
            String otp = " ";
            int lastDigit;

            for(int i=0; i<6; i++){
                lastDigit = (int)System.currentTimeMillis()%10;
                otp = lastDigit + otp;
            }
            return otp;
        };

        System.out.println(supplier.get());
    }
}
