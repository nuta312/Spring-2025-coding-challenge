package com.spring2025.codingbat.sultanbek.warmup1;

public class HasTeen {
    /**
     We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     Given 3 int values, return true if 1 or more of them are teen.
     hasTeen(13, 20, 10) → true
     hasTeen(20, 19, 10) → true
     hasTeen(20, 10, 13) → true
     */
    public static void main(String[] args) {
        System.out.println( hasTeen(13, 20, 10));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return ((a>=13 && a <=19)||(b>=13 && b <=19) || (c>=13 && c <=19));
    }

}
