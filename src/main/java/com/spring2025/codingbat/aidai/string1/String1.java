package com.spring2025.codingbat.aidai.string1;

public class String1 {
/**
 * @author Aidai
 */

/**
 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


 helloName("Bob") → "Hello Bob!"
 helloName("Alice") → "Hello Alice!"
 helloName("X") → "Hello X!"
 */
public String helloName(String name) {
    String hello = "Hello " + name + "!";
    return hello;
}
/**
 Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


 makeAbba("Hi", "Bye") → "HiByeByeHi"
 makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 makeAbba("What", "Up") → "WhatUpUpWhat"
 */
public String makeAbba(String a, String b) {
    return a + b + b + a;
}

}
