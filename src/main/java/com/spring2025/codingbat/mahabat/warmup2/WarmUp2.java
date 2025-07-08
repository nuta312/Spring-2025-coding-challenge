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

    //Count the number of "xx" in the given string.
    // We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    int countXX(String str) {

        int count =0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx")) count++;
        }
        return count;
    }

    // Given a string, return true if the first instance
    // of "x" in the string is immediately followed by another "x".

    boolean doubleX(String str) {

        int x = str.indexOf("x");
        if (x == -1) return false;
        if (x+1  >= str.length()) return false;
        return str.substring(x+1,x+2).equals("x");
    }

    // Given a string, return a new string made of every other char starting with the first,
    // so "Hello" yields "Hlo".

    public String stringBits(String str) {

        String newStr = "";
        for (int i = 0; i < str.length(); i+=2) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }

    // Given a non-empty string like "Code" return a string like "CCoCodCode".

    public String stringSplosion(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0,i+1);
        }
        return result;
    }

    /*Given a string, return the count of the number of times that a substring
    length 2 appears in the string and also as the last 2 chars of the string,
    so "hixxxhi" yields 1 (we won't count the end substring).*/

    public int last2(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length()-2);
        int count = 0;
        for (int i = 0; i < str.length()-2; i++) {
            String sub = str.substring(i,i+2);
            if (sub.equals(end)){
                count++;
            }
        }
        return count;
    }

}
