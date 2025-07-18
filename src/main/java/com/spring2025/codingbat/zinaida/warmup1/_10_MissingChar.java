package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
 */
public class _10_MissingChar {
/*
Given a non-empty string and an int n, return a new string where
the char at index n has been removed. The value of n will be a valid
index of a char in the original string (i.e. n will be in the range
0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */
    public String missingChar(String str, int n) {

        if (n>=0  && n <= str.length()-1){
            return str.substring(0, n) + str.substring(n + 1);
        }return str;
    }
}
