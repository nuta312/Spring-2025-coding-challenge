package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class SleepIn {

/*   The parameter weekday is true if it is a weekday,
     and the parameter vacation is true if we are on vacation.
     We sleep in if it is not a weekday or we're on vacation.
     Return true if we sleep in.

     sleepIn(false, false) → true
     sleepIn(true, false) → false
     sl eepIn(false, true) → true
 */

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
