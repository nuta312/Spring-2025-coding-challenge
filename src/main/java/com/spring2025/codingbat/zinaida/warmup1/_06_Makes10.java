package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
 */
public class _06_Makes10 {

/*
Given 2 ints, a and b, return true if one if them
is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */
    public boolean makes10(int a, int b) {

        return ((a + b)==10 || a == 10 || b == 10);

    }
}
