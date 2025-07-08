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
}
