package com.spring2025.codingbat.aidai.string2;

public class String2 {
    /**
     * @author Aidai
     */
    /**
     Given a string, return a string where for every char in the original, there are two chars.


     doubleChar("The") → "TThhee"
     doubleChar("AAbb") → "AAAAbbbb"
     doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c);
        }
        return result.toString();
    }
}
