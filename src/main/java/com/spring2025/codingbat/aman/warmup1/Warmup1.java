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



 }
