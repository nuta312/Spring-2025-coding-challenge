package com.spring2025.codingbat.aizada.warmup2;
/*
 @author aizada
 */

public class Warmup2 {

    /*
    Warmup-2 > stringTimes
    prev  |  next  |  chance
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.


    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {
        String strT = "";
        for (int i = 0; i < n; i++) {
            strT += str;
        }
        return strT;
    }

    /*
    Warmup-2 > frontTimes
    prev  |  next  |  chance
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public String frontTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            if (str.length() >= 3) {
                res += str.substring(0, 3);
            } else {
                res += str;
            }
        }
        return res;
    }
/*
Warmup-2 > countXX
prev  |  next  |  chance
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equalsIgnoreCase("xx")) {
                count++;
            }

        }
        return count;
    }

    /*
    Warmup-2 > doubleX
    prev  |  next  |  chance
    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */
    boolean doubleX(String str) {
        int i = str.indexOf('x');
        if (i == -1) {
            return false;
        }
        if (i + 1 >= str.length()) {
            return false;
        }
        return str.substring(i + 1, i + 2).equalsIgnoreCase("x");
    }

    /*
    Warmup-2 > stringBits
    prev  |  next  |  chance
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
     */
    public String stringBits(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i = i + 2) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    /*
    Warmup-2 > stringSplosion
    prev  |  next  |  chance
    Given a non-empty string like "Code" return a string like "CCoCodCode".


    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
     */
    public String stringSplosion(String str) {

        String res = "";
        for (int i = 0; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                res += str.charAt(j);
            }
        }
        return res;

    }


}
