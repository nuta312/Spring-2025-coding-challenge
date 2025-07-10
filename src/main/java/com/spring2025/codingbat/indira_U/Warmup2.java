package com.spring2025.codingbat.indira_U;

public class Warmup2 {
    /**
     * @author Indira
     *
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

    /*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3*/
    int countXX(String str) {
        int coun = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                coun++;
            }
        }
        return coun;
    }
}
