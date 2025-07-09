package com.spring2025.codingbat.bekberdi.warmup1;

public class WarmUp1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && !(bSmile)){
            return false;
        }else if(!(aSmile) && bSmile){
            return false;
        }else {
            return true;
        }
    }
    public int sumDouble(int a, int b) {
        if(a == b){
            return (a + b) * 2;
        }else {
            return a + b;
        }
    }
    public int diff21(int n) {
        int num = 21 - n;
        if (n > 21){
            num = (n - 21) * 2;
        }
        return num;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour < 7){
            return true;
        } else if(talking && hour > 20){
            return true;
        } else{
            return false;

        }
    }
    public boolean makes10(int a, int b) {
        if (a ==10 || b == 10 || (a + b) == 10){
            return true;
        } else{
            return false;
        }
    }
}
