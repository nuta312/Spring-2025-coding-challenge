package com.spring2025.codingbat.kairat.warmup1;

public class Warmup1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (weekday && vacation) || !weekday;
    }
    /*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true*/
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }


}
