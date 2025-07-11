package com.spring2025.codingbat.zhanarkhan.warmup2;

public class Warmup2 {
    public static void main(String[] args) {
    }

//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//
//            stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"

    public String stringTimes(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
}
