package com.spring2025.codingbat.zinaida.warmup1;

/*
@author Zinaida
*/
public class _30_StringE {
    public boolean stringE(String str) {
 /*
Return true if the given string contains between
1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
  */
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return count >= 1 && count <= 3;
    }
}
