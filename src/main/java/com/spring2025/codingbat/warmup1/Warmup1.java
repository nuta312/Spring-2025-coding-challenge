package com.spring2025.codingbat.warmup1;

    /// Author Aibekov Daniyar

public class Warmup1 {

        /// The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        /// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        /// sleepIn(false, false) → true
        /// sleepIn(true, false) → false
        /// sleepIn(false, true) → true
        /// Warmup-1 > sleepIn
        public boolean sleepIn(boolean weekday, boolean vacation) {
            return !weekday || vacation;
        }

        /// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        /// We are in trouble if they are both smiling or if neither of them is smiling.Return true if we are in trouble.
        /// monkeyTrouble(true, true) → true
        /// monkeyTrouble(false, false) → true
        /// monkeyTrouble(true, false) → false
        /// Warmup-1 > monkeyTrouble
        public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            return aSmile == bSmile;
        }

        /// Given two int values, return their sum. Unless the two values are the same, then return double their sum.
        /// sumDouble(1, 2) → 3
        /// sumDouble(3, 2) → 5
        /// sumDouble(2, 2) → 8
        /// Warmup-1 > sumDouble
        public int sumDouble(int a, int b) {
            if (a == b) {
                return 2 * (a + b);
            } else {
                return (a + b);
            }
        }

        /// Given an int n, return the absolute
        /// difference between n and 21, except return double the absolute difference if n is over 21.
        /// diff21(19) → 2
        /// diff21(10) → 11
        /// diff21(21) → 0
        /// Warmup-1 > diff21
        public int diff21(int n) {
            if (n <= 21) {
                return 21 - n;
            } else {
                return (n - 21) * 2;
            }
        }

        /// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        /// We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
        /// parrotTrouble(true, 6) → true
        /// parrotTrouble(true, 7) → false
        /// parrotTrouble(false, 6) → false
        /// Warmup-1 > parrotTrouble
        public boolean parrotTrouble(boolean talking, int hour) {
            return talking && (hour < 7 || hour > 20);
        }

        /// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        /// makes10(9, 10) → true
        /// makes10(9, 9) → false
        /// makes10(1, 9) → true
        /// Warmup-1 > makes10
        public boolean makes10(int a, int b) {
            return (a + b == 10 || a == 10 || b == 10);
        }

    }
