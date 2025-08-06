package com.spring2025.codingbat.ayzada.warmup2;
/*
 @author Aizada
 /*
 Warmup-2 > frontTimes
prev  |  next  |  chance
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            if (str.length() >= 3) {
                res += str.substring(0, 3);
            }
            else {
                res += str;
            }
        }
        return res;
    }
}
