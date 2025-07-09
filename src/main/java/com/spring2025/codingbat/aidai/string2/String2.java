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
    /**
     * Return the number of times that the string "hi" appears anywhere in the given string.
     *
     *
     * countHi("abc hi ho") → 1
     * countHi("ABChi hi") → 2
     * countHi("hihi") → 2
     */
    public  int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }
    /**
     * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
     *
     *
     * bobThere("abcbob") → true
     * bobThere("b9b") → true
     * bobThere("bac") → false
     */
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
     *
     *
     * xyBalance("aaxbby") → true
     * xyBalance("aaxbb") → false
     * xyBalance("yaaxbb") → false
     */
    public boolean xyBalance(String str) {
        return str.lastIndexOf('y') >= str.lastIndexOf('x');
    }
    /**
     * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
     *
     *
     * mixString("abc", "xyz") → "axbycz"
     * mixString("Hi", "There") → "HTihere"
     * mixString("xxxx", "There") → "xTxhxexre"
     */
    public String mixString(String a, String b) {
        String res = "";
        int max = Math.max(a.length(),b.length());
        for (int i = 0; i < max; i++) {
            if (i< a.length()){
                res += a.charAt(i);
            }
            if (i < b.length()){
                res += b.charAt(i);
            }
        }
        return res;
    }
    /**
     * Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
     *
     *
     * repeatEnd("Hello", 3) → "llollollo"
     * repeatEnd("Hello", 2) → "lolo"
     * repeatEnd("Hello", 1) → "o"
     */
    public String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        String result = "";

        for (int i = 0; i < n; i++) {
            result += end;
        }
        return result;
    }
}
