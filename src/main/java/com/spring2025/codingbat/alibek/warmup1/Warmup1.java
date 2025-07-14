package com.spring2025.codingbat.alibek.warmup1;

/*
@author Alibek
 */
public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }return sum;
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10){
            return true;
        }else if (a + b == 10){
            return true;
        }else{
            return false;
        }
    }

    public boolean nearHundred(int n) {
        if((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)){
            return true;
        }else{
            return false;
        }
    }

    public boolean posNeg(int a, int b, boolean negative) {
        return ((a > 0 && b < 0 && !negative) || (b > 0 && a < 0 && !negative)
                || (a < 0 && b < 0 && negative)) ? true : false;}

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }return "not " + str;
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        return front + back;
    }

    public String frontBack(String str) {
        String result = "";
        if (str.length() > 1){
            String a = str.substring(0,1);
            String b = str.substring(str.length()-1, str.length());
            String c = str.substring(1, str.length()-1);
            result = b + c + a;
        }else {
            result = str;
        }
        return result;
    }

    public String front3(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }return front + front + front;
    }

    public String backAround(String str) {
        String s = str.substring(str.length() - 1);
        return s + str + s;
    }


}
