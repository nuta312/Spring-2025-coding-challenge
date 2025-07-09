package com.spring2025.codingbat.kairat.warmup2;

/**
 * @author qairatman
 */
public class Warmup2 {

   /* Given a string and a non-negative int n,
    return a larger string that is n copies
    of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi" */

    public String stringTimes(String str, int n) {
        String str2 = "";
        for (int i = 0; i < n; i++) {
            str2 += str;
        }
        return str2;
    }


}
