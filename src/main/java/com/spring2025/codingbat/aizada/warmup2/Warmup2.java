package com.spring2025.codingbat.aizada.warmup2;
/*
 @author aizada
 */

public class Warmup2 {

    /*
    Warmup-2 > stringTimes
    prev  |  next  |  chance
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.


    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {
        String strT = "";
        for (int i = 0; i < n; i++) {
            strT += str;
        }
        return strT;
    }


}
