package com.spring2025.codingbat.amina.warmup2;
/**
 * @author Amina
 */
public class Warmup2 {
    /**
     Task 1 – stringTimes

     Given a string and a non-negative int n, return a larger string
     that is n copies of the original string.

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
    /**
     Task 2 – doubleX

     Given a string, return true if the first instance of "x"
     in the string is immediately followed by another "x".

     doubleX("axxbb") → true
     doubleX("axaxax") → false
     doubleX("xxxxx") → true
     */
    public boolean doubleX(String str) {
        int index = str.indexOf("x");
        return index != -1 && index + 1 < str.length() && str.charAt(index + 1) == 'x';
    }



}
