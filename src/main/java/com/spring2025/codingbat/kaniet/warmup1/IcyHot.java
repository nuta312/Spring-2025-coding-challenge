package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class IcyHot {

    /*  Given two temperatures, return true if one is less
        than 0 and the other is greater than 100.

        icyHot(120, -1) → true
        icyHot(-1, 120) → true
        icyHot(2, 120) → false
    */
    public boolean icyHot(int temp1, int temp2) {
        boolean result = false;
        if ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
