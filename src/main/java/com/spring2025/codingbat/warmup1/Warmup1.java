package com.spring2025.codingbat.warmup1;

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

}
