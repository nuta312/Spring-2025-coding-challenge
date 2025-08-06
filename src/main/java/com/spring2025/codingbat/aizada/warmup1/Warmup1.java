package com.spring2025.codingbat.aizada.warmup1;

/**
 * @author aizada
 */

public class Warmup1 {
    /* Warmup-1 > sleepIn
     prev  |  next  |  chance
     The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


     sleepIn(false, false) → true
     sleepIn(true, false) → false
     sleepIn(false, true) → true

     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (vacation || !weekday);

    }

   /*Warmup-1 > monkeyTrouble
prev  |  next  |  chance
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false

    */

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile || !aSmile && !bSmile);
    }

/*
Warmup-1 > sumDouble
prev  |  next  |  chance
Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */

    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            return sum * 2;
        }
        return sum;
    }

    /*
    Warmup-1 > diff21
    prev  |  next  |  chance
    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
     */
    public int diff21(int n) {
        int res = Math.abs(n - 21);
        if (n > 21) {
            return res * 2;
        }
        return res;
    }

}
