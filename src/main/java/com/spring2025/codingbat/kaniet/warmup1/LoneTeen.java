package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class LoneTeen {

    /*  We'll say that a number is "teen" if it is in the range 13..19 inclusive.
        Given 2 int values, return true if one or the other is teen, but not both.

        loneTeen(13, 99) → true
        loneTeen(21, 19) → true
        loneTeen(13, 13) → false
    */
    public boolean loneTeen(int a, int b) {
        return ((a >= 13 && a <= 19) && !(b >= 13 && b <= 19) || !(a >= 13 && a <= 19) && (b >= 13 && b <= 19))? true : false;
    }
}
