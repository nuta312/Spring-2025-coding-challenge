package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class StartOz {

    /*  Given a string, return a string made of the first 2 chars (if present),
        however include first char only if it is 'o' and include the second only
        if it is 'z', so "ozymandias" yields "oz".

        startOz("ozymandias") → "oz"
        startOz("bzoo") → "z"
        startOz("oxx") → "o"
    */
    public String startOz(String str) {
        String result = "";
        if(str.equals("o") || str.equals("")) {
            result = str;
        } else if(str.substring(0,2).contains("oz")) {
            result = str.substring(0,2);
        } else if(str.substring(1,2).contains("z")) {
            result = str.substring(1,2);
        } else if(str.substring(0,1).contains("o")) {
            result = str.substring(0,1);
        }
        return result;
    }
}
