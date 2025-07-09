package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
*/
public class _23_StartOz {
    /*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only
if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
     */

    public String startOz(String str) {

        String resultat = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            resultat = resultat + "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            resultat = resultat + "z";
        }
        return resultat;
    }

}
