package com.spring2025.codingbat.sultanbek.warmup1;

public class FrontBack {
    /**
     Given a string, return a new string where the first and last chars have been exchanged.
     frontBack("code") → "eodc"
     frontBack("a") → "a"
     frontBack("ab") → "ba"
     */
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    public static String frontBack(String str) {
        return (str.length() > 1)? str.substring(str.length() - 1) + str.substring(1, str.length() - 1 ) + str.substring(0,1) : str ;
    }
}
