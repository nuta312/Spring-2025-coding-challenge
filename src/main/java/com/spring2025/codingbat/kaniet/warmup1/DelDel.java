package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class DelDel {

    /*  Given a string, if the string "del" appears starting at index 1,
        return a string where that "del" has been deleted. Otherwise,
        return the string unchanged.

        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"
    */
    public String delDel(String str) {
        if(str.indexOf("del") == 1) {
            StringBuilder sb = new StringBuilder(str);
            sb.delete(1,4);
            return sb.toString();
        } else {
            return str;
        }
    }
}
