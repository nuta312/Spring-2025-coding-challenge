package com.spring2025.codingbat.mahabat.warmup2;

public class WarmUp2 {
    // Given a string and a non-negative int n,
    // return a larger string that is n copies of the original string.

    public String stringTimes(String str, int n) {

        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

    // Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    // or whatever is there if the string is less than length 3. Return n copies of the front;

    public String frontTimes(String str, int n) {

        int num = 3;
        if (num > str.length()){
            num = str.length();
        }
        String front = str.substring(0,num);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;
    }
}
