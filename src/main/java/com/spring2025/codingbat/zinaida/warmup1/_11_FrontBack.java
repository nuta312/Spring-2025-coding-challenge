package com.spring2025.codingbat.zinaida.warmup1;

/*
@author Zinaida
 */
public class _11_FrontBack {
    /*
    Given a string, return a new string where the first and last chars have been
    exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */
    public String frontBack(String str) {

        if (str.length() <= 1) {
            return str;
        } else {
            String mid = str.substring(1, str.length() - 1);
            return str.charAt(str.length() - 1) + mid + str.charAt(0);
        }
    }

}
