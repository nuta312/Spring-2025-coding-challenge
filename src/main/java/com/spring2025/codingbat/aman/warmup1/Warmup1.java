package com.spring2025.codingbat.aman.warmup1;
 /**
@author Aman
 */
public class Warmup1 {
    // 1.
    public boolean sleepIn(boolean weekday , boolean vacation) {
        return !weekday || vacation;
    }
    // 2.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){
            return true;
        } if(!aSmile && !bSmile){
            return true;
        } else
            return false;
    }
    // 3.
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b){
            sum *= 2;
        }
        return sum;
    }
    // 4.
    public int diff21(int n) {
        if (n > 21 ) {
            return (n - 21)*2;
        } else {
            return 21 - n;
        }
    }
    // 5.
    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 || hour >20){
            if(talking){
                return true;
            }
        }
        return false;
    }
    // 6.
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }
    // 7.
    public boolean nearHundred(int n) {
        return (Math.abs(100-n) <= 10) || (Math.abs(200-n) <= 10);
    }
    // 8.
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }
    // 9.
    public String notString(String str) {
        if (str.startsWith("not")){
            return str;
        } else
            return "not " + str;
    }
    // 10.
    public String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n + 1);
    }
    // 11.
    public String frontBack(String str) {
        if (str.length() <= 1){
            return str;
        }
        String mid = str.substring(1,str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
    // 12.
    public String front3(String str) {
        if (str.length() <=3 ){
            return str + str + str ;
        }
        return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }
    // 13.
    public String backAround(String str) {
        String last = str.substring(str.length()-1);
        return last + str + last;
    }




 }
