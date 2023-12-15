package org.example;

public class HappyNumber {

    public static int square(int num){
        int lastDigit;
        int square = 0;
        while (num!=0){
            lastDigit = num%10;
            square = square + lastDigit * lastDigit;

            num = num/10;
        }
        return square;
    }
    public static boolean squareAndSum(int num){

        while (num!=1){
            num = square(num);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(squareAndSum(19));
    }
}
