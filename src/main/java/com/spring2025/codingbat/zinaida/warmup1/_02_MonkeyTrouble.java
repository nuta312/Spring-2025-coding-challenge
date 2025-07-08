package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
 */
public class _02_MonkeyTrouble {
    /*
    У нас есть два обезьянки — a и b. Параметры aSmile и bSmile показывают, улыбается ли каждая из них. Мы в беде,
    если обе обезьянки улыбаются или если ни одна из них не улыбается. Верните true, если мы в беде.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
     */

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)){
            return true;
        } else {
            return false;
        }
    }
}
