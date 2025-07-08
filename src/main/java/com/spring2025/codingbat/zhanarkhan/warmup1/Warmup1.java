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

    public boolean startHi(String str) {
        return (str.length() >=2 && str.substring(0,2).equals("hi"))? true : false;
    }

    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100)) ? true : false;
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b <= 12 || b >= 20 )) {
            return true;
        } else if ((b >= 13 && b <= 19) && (a <= 12 || a >= 20 )) {
            return true;
        } else {
            return false;
        }
    }

    public String delDel(String str) {

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4, str.length());
        } else {
            return str;
        }
    }

    public boolean mixStart(String str) {
        return (str.length() < 3) ? false : (str.substring(1,3).equals("ix"));
    }

    public String startOz(String str) {
        return (str.length() == 0)? str : (str.length() == 1)? str : (str.substring(0,2).equals("oz")) ? "oz" : (str.substring(1,2).equals("z")) ? "z" : (str.substring(0,1).equals("o")) ? "o" : "";
    }

    public int intMax(int a, int b, int c) {
        return (a > b && a > c)? a : (b > a && b > c)? b : (c > a && c > b)? c : 0;
    }

    public int close10(int a, int b) {
        int correctA = Math.abs(a - 10);
        int correctB = Math.abs(b - 10);
        return (correctA == correctB)? 0 :  (correctA < correctB) ? a : b;
    }

    public boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <=40 || a >= 40 && a <= 50 && b >= 40 && b <=50);
    }

    public int max1020(int a, int b) {
        if (!(a >= 10 && a <= 20)) a = 0;
        if (!(b >= 10 && b <= 20)) b = 0;
        return Math.max(a, b);
    }

}
