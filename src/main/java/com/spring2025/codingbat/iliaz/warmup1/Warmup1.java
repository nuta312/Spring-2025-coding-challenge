package com.spring2025.codingbat.iliaz.warmup1;

public class Warmup1 {
    /*The parameter weekday is true if it is a weekday,
    and the parameter vacation is true if we are on vacation.
     We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
     */

    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleep;
        if (!weekday || vacation) {
            sleep = true;
        } else {
            sleep = false;
        }
        return sleep;
    }
// Given a string,
// return true if the first instance of "x" in the string is
// immediately followed by another "x".

//doubleX("axxbb") → true
//doubleX("axaxax") → false
//doubleX("xxxxx") → true
public boolean doubleX(String str){
        int i = str.indexOf("x");
        if (i == -1 || i == str.length() -1){
            return false;
        }
        return str.substring(i + 1, i + 2).equals("x");
}


}
