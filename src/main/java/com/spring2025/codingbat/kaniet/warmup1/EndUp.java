package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class EndUp {

    /*  Given a string, return a new string where the last 3 chars
        are now in upper case. If the string has less than 3 chars,
        uppercase whatever is there. Note that str.toUpperCase() returns
        the uppercase version of a string.

        endUp("Hello") → "HeLLO"
        endUp("hi there") → "hi thERE"
        endUp("hi") → "HI"
    */
    public String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            int cut = str.length() - 3;
            String start = str.substring(0, cut);
            String end = str.substring(cut).toUpperCase();
            return start + end;
        }
    }
}
