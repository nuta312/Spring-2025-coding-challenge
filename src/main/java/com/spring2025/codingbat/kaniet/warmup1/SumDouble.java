package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class SumDouble {

/*  Given two int values, return their sum.
    Unless the two values are the same, then return double their sum.

    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
*/
public int sumDouble(int a, int b) {
    if (a != b) {
        return a + b;
    } else {
        return (a + b) + (a + b);
    }
}
}
