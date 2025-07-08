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

    /**
     Задача 9 - seeColor

     Given a string, if the string begins with "red" or "blue"
     return that color string, otherwise return the empty string.

     seeColor("redxx") → "red"
     seeColor("xxred") → ""
     seeColor("blueTimes") → "blue"
     */
    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }

    /**
     Задача 10 - extraFront

     Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
     The string may be any length. If there are fewer than 2 chars, use whatever is there.

     extraFront("Hello") → "HeHeHe"
     extraFront("ab") → "ababab"
     extraFront("H") → "HHH"
     */
    public String extraFront(String str) {
        String front = str.length() < 2 ? str : str.substring(0, 2);
        return front + front + front;
    }

    /**
     Задача 11 - startWord

     Given a string and a second "word" string, we'll say that the word matches the string
     if it appears at the front of the string, except its first char does not need to match exactly.
     On a match, return the front of the string, or otherwise return the empty string.

     startWord("hippo", "hi") → "hi"
     startWord("hippo", "xip") → "hip"
     startWord("hippo", "i") → "h"
     */
    public String startWord(String str, String word) {
        if (str.length() < word.length()) return "";
        String slice = str.substring(1, word.length());
        String wordSlice = word.substring(1);
        if (slice.equals(wordSlice)) {
            return str.substring(0, word.length());
        }
        return "";
    }

    /**
     Задача 12 - makeAbba
     Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     makeAbba("Hi", "Bye") → "HiByeByeHi"
     makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /**
     Задача 13 - extraEnd
     Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     makeAbba("Hi", "Bye") → "HiByeByeHi"
     makeAbba("Yo", "Alice") → "YoAliceAliceYo"
     makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 + last2;

    }

    /**
     Задача 14 - withoutEnd

     Given a string, return a version without the first and last char, so "Hello" yields "ell".
     The string length will be at least 2.

     withoutEnd("Hello") → "ell"
     withoutEnd("java") → "av"
     withoutEnd("coding") → "odin"
     */
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     Задача 15 - left2

     Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
     The string length will be at least 2.

     left2("Hello") → "lloHe"
     left2("java") → "vaja"
     left2("Hi") → "Hi"
     */
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    /**
     Задача 16 - withouEnd2

     Given a string, return a version without both the first and last char of the string.
     The string may be any length, including 0.

     withouEnd2("Hello") → "ell"
     withouEnd2("abc") → "b"
     withouEnd2("ab") → ""
     */
    public String withouEnd2(String str) {
        return str.length() <= 2 ? "" : str.substring(1, str.length() - 1);
    }

    /**
     Задача 17 - nTwice

     Given a string and an int n, return a string made of the first and last n chars from the string.
     The string length will be at least n.

     nTwice("Hello", 2) → "Helo"
     nTwice("Chocolate", 3) → "Choate"
     nTwice("Chocolate", 1) → "Ce"
     */
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    /**
     Задача 18 - hasBad

     Return true if "bad" appears starting at index 0 or 1 in the string.
     The string may be any length.

     hasBad("badxx") → true
     hasBad("xbadxx") → true
     hasBad("xxbadxx") → false
     */
    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) return true;
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) return true;
        return false;
    }

    /**
     Задача 19 - conCat

     Concatenate two strings. If the concatenation creates a double-char,
     then omit one of the chars.

     conCat("abc", "cat") → "abcat"
     conCat("dog", "cat") → "dogcat"
     conCat("abc", "") → "abc"
     */
    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }

    /**
     Задача 20 - frontAgain

     Return true if the first 2 chars in the string also appear at the end of the string.

     frontAgain("edited") → true
     frontAgain("edit") → false
     frontAgain("ed") → true
     */
    public boolean frontAgain(String str) {
        return str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }


}
