package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
 */
public class _07_NearHundred {

/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num)
computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */
    public boolean nearHundred(int n) {

        if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
            return true;
        }return false;

    }

}
