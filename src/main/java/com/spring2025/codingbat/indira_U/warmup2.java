package com.spring2025.codingbat.indira_U;
/*
@author Indira
 */
public class warmup2 {
    /*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    /*

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        String ftont = str.length() < 3? str : str.substring(0,3);
        for (int i = 0; i < n; i++) {
            sb.append(ftont);
        }
        return sb.toString();
    }

}
