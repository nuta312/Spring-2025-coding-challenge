package com.spring2025.codingbat.zhanarkhan.warmup1;

public class Warmup1 {
    public static void main(String[] args) {
    }

    //        The parameter weekday is true if it is a weekday, and the parameter
//        vacation is true if we are on vacation. We sleep in if it is not a
//        weekday or we're on vacation. Return true if we sleep in.
//
//
//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        } else {
            return true;
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile == true && bSmile == false) || (aSmile == false && bSmile == true)) {
            return false;
        } else {
            return true;
        }
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a+b)*2;
        } else {
            return a + b;
        }
    }


    public int diff21(int n) {
        if (n >= 21) {
            return (n-21)*2;
        } else {
            return 21 - n;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true && (hour > 20 || hour < 7)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean makes10(int a, int b) {
        if ((a == 10 || b == 10) || (a + b == 10)) {
            return true;
        } else {
            return false;
        }
    }


    public boolean nearHundred(int n) {
        if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210)) {
            return true;
        } else {
            return false;
        }
    }
}
