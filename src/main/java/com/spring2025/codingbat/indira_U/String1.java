package com.spring2025.codingbat.indira_U;

public class String1 {
    /**
     * @author Indira
     *
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
     */
    public String helloName(String name) {
        String symbol = "!";
        String hello = "Hello " + name + symbol;
        return hello;
    }
    /*

Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"*/
public String makeAbba(String a, String b) {

        String make = a + b + b + a;

     return make;
    }
/*

The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
public String makeTags(String tag, String word) {

    return "<" + tag + ">"  + word + "<" + "/" + tag + ">";
}
/*

Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]
 */
public String makeOutWord(String out, String word) {
    return out.substring(0, 2) + word + out.substring(2);
}

    /*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiH*/
    public String extraEnd(String str) {
        return str.substring(str.length()-2)
                +str.substring(str.length()-2)
                +str.substring(str.length()-2);
    }
/*

Given a string, return the string made of its first two chars, so the String "Hello"
 yields "He". If the string is shorter than length 2, return whatever there is, so "X"
 yields "X", and the empty string "" yields the empty string "". Note that str.length()
 returns the length of a string.
 */
public String firstTwo(String str) {
    if (str.length() > 2) {
        return str.substring(0,2);
    }
    return str;

}

    /*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"*/
    public String firstHalf(String str) {
        return  str.substring(0, str.length() / 2);

    }
    /*

Given a string, return a version without the first and last char, so "Hello" yields "ell".
 The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
     */
    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }


}
