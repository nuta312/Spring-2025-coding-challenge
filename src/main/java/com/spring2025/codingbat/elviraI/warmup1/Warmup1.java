package com.spring2025.codingbat.elviraI.warmup1;

import static java.lang.Math.abs;

/**
 * @author ElviraI
 */
public class Warmup1 {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }
    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else return (a + b) * 2;
    }
    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        }
        return (n - 21) * 2;
    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;

        }
    }
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b == 10)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean nearHundred(int n) {
        if (abs(100 - n) <= 10 || (abs(200 - n) <= 10)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean posNeg(int a, int b, boolean negative) {
        return (a > 0 && b < 0 && !negative) || (b > 0 && a < 0 && !negative) || (a < 0 && b < 0 && negative) ? true : false;//тут можно тру фолс опустиьт

    }
    public String notString(String str) {
        return (str.startsWith("not") ? str : "not ".concat(str));

    }
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        return sb.deleteCharAt(n).toString();
    }
    public String frontBack(String str) {
        if (str.length() < 2) return str;
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);

    }
    public String front3(String str) {
        return (str.length() >= 3) ?
                str.substring(0, 3).concat(str.substring(0, 3)).concat(str.substring(0, 3)) :
                str.concat(str).concat(str);
    }
    public String backAround(String str) {
        String r = str.substring(str.length() - 1);

        return (str.length() > 2) ? r + str + r : str + str + str;

    }
    public boolean or35(int n) {
        if ((n % 3 == 0) || (n % 5 == 0)) {
            return true;
        } else {
            return false;
        }
    }












}
