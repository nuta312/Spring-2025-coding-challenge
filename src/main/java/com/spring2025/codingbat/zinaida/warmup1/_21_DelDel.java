package com.spring2025.codingbat.zinaida.warmup1;

/*
@author Zinaida
*/
public class _21_DelDel {
    /*
Given a string, if the string "del" appears starting at index 1, return
a string where that "del" has been deleted. Otherwise, return the string
unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */

    public String delDel(String str) {

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

}
