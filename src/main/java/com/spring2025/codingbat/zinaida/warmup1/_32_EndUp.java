package com.spring2025.codingbat.zinaida.warmup1;

/*
@author Zinaida
*/
public class _32_EndUp {
    /*
    Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there. Note that
    str.toUpperCase() returns the uppercase version of a string.

    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"
     */
    public String endUp(String str) {

        String up = "";
        String result = "";

        if (str.length() < 3) {
            return str.toUpperCase();
        } else {
            up = str.substring(str.length() - 3).toUpperCase();
            result = str.substring(0, str.length() - 3) + up;
            return result;
        }
    }
}
