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

    /*
    Warmup-2 > frontTimes
    prev  |  next  |  chance
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public String frontTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            if (str.length() >= 3) {
                res += str.substring(0, 3);
            } else {
                res += str;
            }
        }
        return res;
    }

}
