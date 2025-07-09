package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class StringE {

    /*  Return true if the given string contains between 1 and 3 'e' chars.

        stringE("Hello") → true
        stringE("Heelle") → true
        stringE("Heelele") → false
    */
    public boolean stringE(String str) {
        int eCount = 0;
        char c = 'e';
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                eCount++;
            }
        }
        return (eCount >=1 && eCount <= 3) ? true : false;
    }
}
