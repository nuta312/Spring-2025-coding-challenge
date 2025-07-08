package com.spring2025.codingbat.tamara.warmur1;

public class Warmur_1 {
    public static void main(String[] args) {
        Warmur_1 speepinObj = new Warmur_1();

        System.out.println(speepinObj.sleepin(false, false));
        System.out.println(speepinObj.sleepin(true, false));
        System.out.println(speepinObj.sleepin(false, true));


      /* The parameter weekday is true if it is a weekday, and the parameter vacation
       is true if we are on vacation. We sleep in if it is not a weekday
       or we're on vacation. Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */
    }
    public boolean sleepin(boolean weekday, boolean vacation){
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    }


