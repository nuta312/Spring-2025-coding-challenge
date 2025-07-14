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


}
