package com.spring2025.codingbat.beslan.warmup2;

/*
@author Beslan
 */
public class Warmup2 {
    /*
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
    */

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

    /*

    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public String frontTimes(String str, int n) {
        String res2 = "";
        if (str.length() >= 3) {
            String res1 = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                res2 = res2 + res1;
            }
        } else {
            for (int i = 0; i < n; i++) {
                res2 = res2 + str;
            }
        }
        return res2;
    }
    /*
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
     */

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) count++;
        }
        return count;
    }

    /*

    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        if (i + 1 >= str.length()) return false;
        return str.substring(i + 1, i + 2).equals("x");
    }

    /*
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
     */
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
        }
        return result;
    }

    /*
    Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
     */
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    /*
    Given a string, return the count of the number of times that a substring length 2
    appears in the string and also as the last 2 chars of the string,
    so "hixxxhi" yields 1 (we won't count the end substring).

    last2("hixxhi") → 1
    last2("xaxxaxaxx") → 1
    last2("axxxaaxx") → 2
     */
    public int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }
}
