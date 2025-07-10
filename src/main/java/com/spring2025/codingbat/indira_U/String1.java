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
}
