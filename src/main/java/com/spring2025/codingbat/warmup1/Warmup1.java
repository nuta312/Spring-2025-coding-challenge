package com.spring2025.codingbat.warmup1;

public class Warmup1 {

    /// sleepIn(false, false) → true
    /// sleepIn(true, false) → false
    /// sleepIn(false, true) → true

    ///Warmup-1 > sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

}
