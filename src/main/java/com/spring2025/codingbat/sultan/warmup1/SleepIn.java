package com.spring2025.codingbat.sultan.warmup1;

public class SleepIn {
    /**
     The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

     sleepIn(false, false) → true
     sleepIn(true, false) → false
     sleepIn(false, true) → true
     */
    public static void main(String[] args) {
        System.out.println(sleepIn(true, false));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation) ? true : false;
    }

}
