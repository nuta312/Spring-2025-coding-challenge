package com.spring2025.codingbat.iliaz.warmup1;

public class Warmup1 {
    /*The parameter weekday is true if it is a weekday,
    and the parameter vacation is true if we are on vacation.
     We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
     */

    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleep;
        if (!weekday || vacation) {
            sleep = true;
        } else {
            sleep = false;
        }
        return sleep;
    }
// Given a string,
// return true if the first instance of "x" in the string is
// immediately followed by another "x".

    //doubleX("axxbb") → true
//doubleX("axaxax") → false
//doubleX("xxxxx") → true
    public boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1 || i == str.length() - 1) {
            return false;
        }
        return str.substring(i + 1, i + 2).equals("x");
    }

    /* Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false

     */
    public boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10 || (Math.abs(200 - n) <= 10)){
            return true;
        } else {
            return false;
        }
    }
    /* Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

     */
    public boolean posNeg(int a, int b, boolean negative) {
        return ((a > 0 && b < 0 && !negative) || (b > 0 && a < 0 && !negative) || (a < 0 && b < 0 && negative));
    }

}