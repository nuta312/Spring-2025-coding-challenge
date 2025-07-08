package com.spring2025.codingbat.aidai.warmup1;

public class Warmup1 {
    /**
     * @author Aidai
     */

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;

    }

    /**
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     */
    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return (a + b);
        }
    }
/**
 Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
 */
public int diff21(int n) {
    if (n > 21){
        return 2 * (n - 21);
    } else {
        return 21 - n;
    }
}
}

