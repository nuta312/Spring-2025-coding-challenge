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

    /**
     Задача 5 - theEnd

     Given a string, return a string length 1 from its front,
     unless front is false, in which case return a string length 1 from its back.
     The string will be non-empty.

     theEnd("Hello", true) → "H"
     theEnd("Hello", false) → "o"
     theEnd("oh", true) → "o"
     */
    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

    /**
     Задача 6 - endsLy

     Given a string, return true if it ends in "ly".

     endsLy("oddly") → true
     endsLy("y") → false
     endsLy("oddy") → false
     */
    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    /**
     Задача 7 - middleThree

     Given a string of odd length, return the string length 3 from its middle,
     so "Candy" yields "and". The string length will be at least 3.

     middleThree("Candy") → "and"
     middleThree("and") → "and"
     middleThree("solving") → "lvi"
     */
    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    /**
     Задача 8 - lastChars

     Given 2 strings, a and b, return a new string made of the first char of a and the last char of b.
     If either string is length 0, use '@' for its missing char.

     lastChars("last", "chars") → "ls"
     lastChars("yo", "java") → "ya"
     lastChars("hi", "") → "h@"
     */
    public String lastChars(String a, String b) {
        char first = a.length() > 0 ? a.charAt(0) : '@';
        char last = b.length() > 0 ? b.charAt(b.length() - 1) : '@';
        return "" + first + last;
    }

}
