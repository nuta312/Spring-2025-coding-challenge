package com.spring2025.codingbat.zinaida.warmup1;

/*
@author Zinaida
*/
public class _24_IntMax {

    /*

    Given three int values, a b c, return the largest.

    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3
     */
    public int intMax(int a, int b, int c) {

        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else if (c > a && c > b) {
            max = c;
        }
        return max;
    }

}
