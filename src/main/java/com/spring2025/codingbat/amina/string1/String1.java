package com.spring2025.codingbat.amina.string1;
/**
 * @author Amina
 */
public class String1 {
    /**
     Задача 1 - helloName

     Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

     helloName("Bob") → "Hello Bob!"
     helloName("Alice") → "Hello Alice!"
     helloName("X") → "Hello X!"
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /**
     Задача 2 - firstHalf

     Given a string of even length, return the first half.
     So the string "WooHoo" yields "Woo".

     firstHalf("WooHoo") → "Woo"
     firstHalf("HelloThere") → "Hello"
     firstHalf("abcdef") → "abc"
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    /**
     Задача 3 - makeOutWord

     Given an "out" string length 4, such as "<<>>", and a word,
     return a new string where the word is in the middle of the out string.

     makeOutWord("<<>>", "Yay") → "<<Yay>>"
     makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
     makeOutWord("[[]]", "word") → "[[word]]"
     */
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    /**
     Задача 4 - nonStart

     Given 2 strings, return their concatenation, except omit the first char of each.
     The strings will be at least length 1.

     nonStart("Hello", "There") → "ellohere"
     nonStart("java", "code") → "avaode"
     nonStart("shotl", "java") → "hotlava"
     */
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

}
