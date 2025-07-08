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

    public boolean posNeg(int a, int b, boolean negative) {
        return (a > 0 && b < 0 && negative == false) ? true : (a < 0 && b > 0 && negative == false) ? true : (a < 0 && b < 0 && negative == true) ? true : false;
    }

    public String notString(String str) {
        return (str.length() >= 3 && str.substring(0, 3).equals("not"))? str : "not " + str;
    }

    public String missingChar(String str, int n) {
        StringBuilder sb1 = new StringBuilder(str);
        return (str.length() > n && n >= 0)? sb1.deleteCharAt(n).toString() : str;
    }

    public String frontBack(String str) {
        return (str.length() > 1)? str.substring(str.length() - 1) + str.substring(1, str.length() - 1 ) + str.substring(0,1) : str ;
    }

    public String front3(String str) {
        return (str.length() >= 3) ? str.substring(0,3) + str.substring(0,3) + str.substring(0,3) : str + str + str;
    }

    public String backAround(String str) {
        return (str.length() >= 2)? str.substring(str.length() - 1) + str + str.substring(str.length() - 1) : str + str + str;
    }

    public boolean or35(int n) {
        return (n % 3 == 0)? true : (n % 5 == 0)? true : false;
    }

    public String front22(String str) {
        return (str.length() >= 2)? str.substring(0,2) + str + str.substring(0,2) : str+str+str;
    }
}
