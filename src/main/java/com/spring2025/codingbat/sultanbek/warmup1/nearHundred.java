package com.spring2025.codingbat.sultanbek.warmup1;

public class nearHundred {
    /**
     Given an int n, return true if it is within 10 of 100 or 200.
     Note: Math.abs(num) computes the absolute value of a number.
     nearHundred(93) → true
     nearHundred(90) → true
     nearHundred(89) → false
     */
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
    }

    public static boolean nearHundred(int n) {
        if (Math.abs(100 - n) <=10 || Math.abs(200 - n) <= 10){
            return true;
        } else {
            return false;
        }
    }

}
