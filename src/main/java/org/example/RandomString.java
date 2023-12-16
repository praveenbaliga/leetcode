package org.example;

import java.util.Random;

public class RandomString {

    public static String getSaltString() throws InterruptedException {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();

        while (salt.length() < 10){
            double start = System.currentTimeMillis();
            double end = System.currentTimeMillis();
           // int intVal = (end-start)*SALTCHARS.length();
            System.out.println((end-start)/10000);
        }

        return "hellop";
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(getSaltString());
    }
}
