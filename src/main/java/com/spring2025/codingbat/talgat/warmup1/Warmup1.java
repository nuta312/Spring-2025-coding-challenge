package com.spring2025.codingbat.talgat.warmup1;

public class Warmup1 {
    public static void main(String[] args) {

    }

    // W1 sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    // w2 monkeyTrouble
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    //w2 sumDouble
    public int sumDouble(int a, int b) {
        return (a == b) ? (a + b)*2 : a + b;
    }

    //w2 diff21
    public int diff21(int n) {
        return (n > 21) ? (n - 21) * 2: 21 - n;
    }

    //w2 parrotTrouble
    public boolean parrotTrouble(boolean talking, int hour) {

        if (hour <= 23 && hour >= 0){
            return talking && (hour < 7 || hour > 20);
        }else {
            return false;
        }

    }

    //w2 makes10
    public boolean makes10(int a, int b) {

        return (a == 10 || b == 10) || a + b == 10;
    }

    //w2 nearHundred
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        return negative ? (a < 0 && b < 0) : (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    public String notString(String str) {
        String n = "not ";
        if (str.length() >= 3){
            if(str.substring(0,3).equals("not")){
                return str;
            }else {
                return n.concat(str);
            }
        }else {
            return n.concat(str);
        }
    }

    public String missingChar(String str, int n) {
        StringBuilder t = new StringBuilder(str);
        String result = t.deleteCharAt(n).toString();
        return result;
    }

    public String frontBack(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }

        char fch = str.charAt(0);
        char lch = str.charAt(str.length() - 1);
        String mid = str.substring(1, str.length() - 1);

        return lch + mid + fch;

    }

    public String front3(String str) {
        return (str.length()>3) ? str.substring(0,3)+str.substring(0,3)+str.substring(0,3):str + str + str;
    }

    public String backAround(String str) {
        return (str.length() >= 1) ? str.charAt(str.length()-1)+str+str.charAt(str.length()-1):str;
    }

    public boolean or35(int n) {
        return n%3==0||n%5==0;
    }

    public String front22(String str) {
        return (str.length() > 2 ) ? str.substring(0,2)+str+str.substring(0,2):str+str+str;
    }





}
