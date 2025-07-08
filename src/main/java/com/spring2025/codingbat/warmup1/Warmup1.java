package com.spring2025.codingbat.warmup1;

    /// Author Aibekov Daniyar

public class Warmup1 {

    /// sleepIn(false, false) → true
    /// sleepIn(true, false) → false
    /// sleepIn(false, true) → true

    ///Warmup-1 > sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
    /// monkeyTrouble(true, true) → true
    /// monkeyTrouble(false, false) → true
    /// monkeyTrouble(true, false) → false

    /// Warmup-1 > monkeyTrouble
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }
    /// sumDouble(1, 2) → 3
    /// sumDouble(3, 2) → 5
    /// sumDouble(2, 2) → 8

    /// Warmup-1 > sumDouble
    public int sumDouble(int a, int b) {
        if (a == b){
            return 2 * (a + b);
        }else {
            return (a + b);
        }
    }
    /**
     Given an int n, return the absolute
     difference between n and 21, except return double the absolute difference if n is over 21.

     /// diff21(19) → 2
     /// diff21(10) → 11
     /// diff21(21) → 0

     Warmup-1 > diff21
     */
    public int diff21 (int n){
        if(n <= 21){
            return 21 - n;
        }else{
            return (n -21) * 2;
        }
    }





    }
