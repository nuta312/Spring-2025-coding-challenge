package com.spring2025.codingbat.janara.warmup1;

public class Warmup1 {

    /**
     * @author Janara
     */
    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     *
     *
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return(!weekday|| vacation) ?true:false;
    }
    /**
     * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
     *
     *
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     */
    public int diff21(int n) {
        if(n<=21){
            return Math.abs(21-n);
        }else{
            return Math.abs(n-21)*2;
        }
    }
/**
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
 *
 *
 * parrotTrouble(true, 6) → true
 * parrotTrouble(true, 7) → false
 * parrotTrouble(false, 6) → false
 */
public boolean parrotTrouble(boolean talking, int hour) {
    if(talking && (hour <7 || hour > 20)){
        return true;
    }else{
        return false;
    }
}
}
