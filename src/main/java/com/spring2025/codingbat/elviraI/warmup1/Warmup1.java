package com.spring2025.codingbat.elviraI.warmup1;

import static java.lang.Math.abs;

/**
 * @author ElviraI
 */
public class Warmup1 {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }
    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else return (a + b) * 2;
    }


}
