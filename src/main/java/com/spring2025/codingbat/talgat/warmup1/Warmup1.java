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
}
