package com.spring2025.codingbat.indiraU.warmup1;

public class Warmup1 {

/*The parameter weekday is true if it is a weekday,
 and the parameter vacation is true if we are on vacation.
  We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in

 */

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation) ? true : false;
    }
    /* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


     monkeyTrouble(true, true) → true
     monkeyTrouble(false, false) → true
     monkeyTrouble(true, false) → false*/
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }
     /*

   /*

 Given two int values, return their sum. Unless the two values are the same, then return double their sum.


 sumDouble(1, 2) → 3
 sumDouble(3, 2) → 5
 sumDouble(2, 2) → 8
     */
     public int sumDouble(int a, int b) {
         int sum = a + b;
         if (a != b) {
             return sum;
         } else {
             return sum * 2;
         }
     }
    /*

 Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


 diff21(19) → 2
 diff21(10) → 11
 diff21(21) → 0
     */
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
    /*

We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
    */
    public boolean parrotTrouble(boolean talking, int hour) {

        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }




}
