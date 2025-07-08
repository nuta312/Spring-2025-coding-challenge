package com.spring2025.codingbat.mahabat.warmup2;

public class WarmUp2 {
    // Given a string and a non-negative int n,
    // return a larger string that is n copies of the original string.

    public String stringTimes(String str, int n) {

        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }
}
