package com.spring2025.codingbat.sultan.warmup1;

public class StartHi {
    /**
     Given a string, return true if the string starts with "hi" and false otherwise.
     startHi("hi there") → true
     startHi("hi") → true
     startHi("hello hi") → false
     */

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
    }
    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }

}
