package com.spring2025.codingbat.zinaida.warmup1;

/*
@author Zinaida
*/
public class _28_In3050 {
    /*
Given 2 int values, return true if they are both in the range
30..40 inclusive, or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
     */

    public boolean in3050(int a, int b) {

        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40) ||
                (a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            return true;
        } else {
            return false;
        }
    }
}
