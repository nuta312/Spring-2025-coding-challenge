package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class Close10 {

    /*  Given 2 int values, return whichever value is nearest to the value 10,
        or return 0 in the event of a tie. Note that Math.abs(n) returns the
        absolute value of a number.

        close10(8, 13) → 8
        close10(13, 8) → 8
        close10(13, 7) → 0
    */
    public int close10(int a, int b) {
        int numA = Math.abs(a - 10);
        int numB = Math.abs(b - 10);
        if(numA < numB) {
            return a;
        } else if(numB < numA) {
            return b;
        } else {
            return 0;
        }
    }
}
