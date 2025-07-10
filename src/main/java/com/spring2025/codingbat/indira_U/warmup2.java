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
/*

Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
int countXX(String str) {
    int coun = 0;
    for (int i = 0; i < str.length()-1; i++) {
        if (str.substring(i, i + 2).equals("xx")) {
            coun++;
        }
    }
    return coun;
}
/*

Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
public String stringBits(String str) {
    String str2 = "";
    for (int i = 0; i < str.length() ; i+=2) {
        str2 += str.charAt(i);
    }
    return str2;
}

   /* Given a non-empty string like "Code" return a string like "CCoCodCode".


    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"*/
   public String stringSplosion(String str) {
       String result = "";
       for (int i = 1; i <= str.length(); i++) {
           result += str.substring(0,i);
       }
       return result;
   }
}
