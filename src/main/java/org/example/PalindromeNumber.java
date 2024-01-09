package org.example;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        int reverse = 0, lastDigit, number = x;

        if (x<0){
            return false;
        }else{
            while ( x > 0){
                lastDigit = x%10;
                reverse = reverse * 10 + lastDigit;
                x = x/10;
            }

        }

        return number == reverse;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
