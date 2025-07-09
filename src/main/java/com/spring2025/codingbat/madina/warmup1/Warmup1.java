package com.spring2025.codingbat.madina.warmup1;

public class Warmup1 {
    public static void main(String[] args) {
        Warmup1 obj =new Warmup1();
        System.out.println(obj.sleepIn(false,false));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!(weekday) && (vacation)) {
            return true;
        } else if (weekday && !(vacation)) {
            return false;
        } else if (!(weekday) && vacation) {
            return true;
        } else {
            return true;
        }

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        } return false;
    }
    public int sumDouble(int a, int b) {
        if (a == b){
            return 2*(a+b);
        } else {
            return a+b ;

        }

    }
    public int diff21(int n) {
        if (n <=21){
            return 21-n;
        } else {
            return (n - 21)*2;
        }
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)){
            return true;
        }
        return false ;
    }
    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10 || (a+b) == 10){
            return true;
        } else {
            return false;
        }
    }
    public boolean nearHundred(int n) {
        boolean near100 = (n >= 90 && n <= 110);
        boolean near200 = (n >= 190 && n <= 210);
        return near100 || near200;
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return a <0 && b < 0;
        } else {
            return (a<0 && b > 0 || b<0 && a>0 );
        }
    }
    public String notString(String str) {
        return (str.startsWith("not") ? str: "not ".concat(str));
    }
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        return sb.deleteCharAt(n).toString();
    }
    public String frontBack(String str) {
        if(str.length() < 2) return str;
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

}
