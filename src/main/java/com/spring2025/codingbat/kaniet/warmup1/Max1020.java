package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class Max1020 {

    /*  Given 2 positive int values, return the larger value that is in the range
        10..20 inclusive, or return 0 if neither is in that range.

        max1020(11, 19) → 19
        max1020(19, 11) → 19
        max1020(11, 9) → 11
    */
    public int max1020(int a, int b) {
        boolean isInRangeA = (a >= 10 && a <= 20);
        boolean isInRangeB = (b >= 10 && b <= 20);
        if (isInRangeA && isInRangeB) {
            return Math.max(a, b);
        } else if(isInRangeA) {
            return a;
        } else if(isInRangeB) {
            return b;
        } else {
            return 0;
        }
    }
}
