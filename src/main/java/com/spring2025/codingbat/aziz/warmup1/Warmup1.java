package com.spring2025.codingbat.aziz.warmup1;

public class Warmup1 {


    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false || vacation == true){
            return true;
        }else{
            return false;
        }
    }


    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile){
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if(a != b){
            return a + b;
        }else {
            return (a + b) * 2;
        }
    }


    public int diff21(int n) {
        if(n <= 21){
            return 21 - n;
        }else{
            return (n - 21) * 2;
        }
    }


    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }


    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10 || a+b == 10){
            return true;
        }else{
            return false;
        }
    }


    public boolean nearHundred(int n) {
        if(n >= 90 && n <= 110 || n >= 190 && n <= 210){
            return true;
        }else{
            return false;
        }
    }


    public boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return (a < 0 && b < 0);
        }else{
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }


    public String notString(String str) {
        if(str.startsWith("not")){
            return str;
        }else {
            return "not " + str;
        }
    }


    public String missingChar(String str, int n) {
        String result = str.substring(0, n) + str.substring(n + 1, str.length());
        return result;
    }


    public String frontBack(String str) {
        if (str.length() <= 1){
            return str;
        }else {
            String mid = str.substring(1, str.length() - 1);
            return str.charAt(str.length() -1 ) + mid + str.charAt(0);
        }
    }


    public String front3(String str) {
        if (str.length() < 3){
            return str + str+ str;
        }else {
            String str2 = str.substring(0,3);
            return str2 + str2+ str2;
        }
    }
}
