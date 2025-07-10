package com.spring2025.codingbat.zinaida.warmup2;

/*
@author Zinaida
 */
public class Warmup2 {

/*
Given a string and a non-negative int n, return a larger string that is n
copies of the original string.

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

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

    public String frontTimes(String str, int n) {
        String result = "";
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                result += str;
            }
        } else {
            for (int i = 0; i < n; i++) {
                str = str.substring(0, 3);
                result += str;
            }
        }
        return result;
    }

 /*
 Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
  */

    int countXX(String str) {

        int count_xx = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count_xx += 1;
            }
        }
        return count_xx;
    }

  /*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
  */

    boolean doubleX(String str) {

        boolean result = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    result = true;
                }
                break;
            }
        }
        return result;

    }
}
