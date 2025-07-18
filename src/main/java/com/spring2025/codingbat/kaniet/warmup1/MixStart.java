package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class MixStart {

    /*  Return true if the given string begins with "mix", except
        the 'm' can be anything, so "pix", "9ix" .. all count.

        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false
    */
    public boolean mixStart(String str) {
        if(str.length() < 3) {
            return false;
        } else if (str.substring(1, 3).contains("ix")){
            return true;
        } else {
            return false;
        }
    }
}
