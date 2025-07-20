package com.spring2025.codingbat.iliaz.warmup2;

public class Warmup2 {
    /*
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
     */

    public String stringTimes(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }

        return result;
    }
/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
boolean doubleX(String str) {
    int i = str.indexOf("x");
    if (i == -1 || i == str.length() -1){
        return false;
    }
    return str.substring(i + 1, i + 2).equals("x");
}
}
