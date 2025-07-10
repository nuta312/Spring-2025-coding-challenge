package com.spring2025.codingbat.zavira.warmup1;

public class WarmUp1 {
    public static void main(String[] args) {

    }

    /* The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
*/
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        } else if (weekday == true && vacation == false) {
            return false;
        } else if (weekday == false && vacation == true) {
            return true;
        }
        return true;
    }

    /* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false

     */

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile && bSmile || aSmile && !bSmile) {
            return false;
        }
        return true;
    }
}
